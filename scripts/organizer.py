import os
import shutil
import re
from leetcode_client import LeetCodeClient
from streak_tracker import StreakTracker
from readme_generator import ReadmeGenerator

EXT_TO_LANG = {
    ".py": "python",
    ".java": "java",
    ".cpp": "cpp",
    ".sql": "sql",
    ".js": "javascript",
    ".ts": "typescript",
    ".go": "go",
    ".rb": "ruby",
    ".rs": "rust"
}

class Organizer:
    def __init__(self):
        self.client = LeetCodeClient()
        self.tracker = StreakTracker()
        self.readme = ReadmeGenerator()
        self.ignored_dirs = {".git", ".github", "scripts", "stats", "solutions", ".gemini", "__pycache__"}
        self.ignored_files = {"README.md", "requirements.txt", "implementation_plan.md", ".gitignore"}

    def run(self):
        new_problems_count = 0
        
        # Scan root for files and folders
        items = os.listdir(".")
        for item in items:
            if item in self.ignored_dirs or item in self.ignored_files:
                continue
            
            if os.path.isdir(item):
                new_problems_count += self._process_directory(item)
            elif os.path.isfile(item):
                new_problems_count += self._process_file(item)
        
        if new_problems_count > 0:
            print(f"Organized {new_problems_count} new solutions.")
            self.tracker.update_streak(new_problems_count)
            self.readme.generate()
        else:
            print("No new solutions to organize.")

    def _process_directory(self, dir_name):
        # Expecting folder like '0185-department-top-three-salaries'
        # Or just 'two-sum'
        slug = self._extract_slug(dir_name)
        if not slug:
            return 0
            
        metadata = self.client.fetch_problem_metadata(slug)
        if not metadata:
            print(f"  Could not fetch metadata for {slug}. Skipping folder.")
            return 0
            
        print(f"  Found metadata for: {metadata['title']}")
        count = 0
        for file in os.listdir(dir_name):
            ext = os.path.splitext(file)[1]
            if ext in EXT_TO_LANG:
                if self._move_file(os.path.join(dir_name, file), metadata, ext):
                    count += 1
        
        # Cleanup directory if empty
        if count > 0 and not os.listdir(dir_name):
            os.rmdir(dir_name)
        elif count > 0:
            # Check if only non-solution files left
            remaining = os.listdir(dir_name)
            if all(os.path.splitext(f)[1] not in EXT_TO_LANG for f in remaining):
                shutil.rmtree(dir_name) # Be careful with rmtree, but usually these are just temp folders
                
        return count

    def _process_file(self, file_name):
        ext = os.path.splitext(file_name)[1]
        if ext not in EXT_TO_LANG:
            return 0
            
        slug = self._extract_slug(file_name)
        if not slug:
            return 0
            
        metadata = self.client.fetch_problem_metadata(slug)
        if not metadata:
            print(f"  Could not fetch metadata for {slug}. Skipping file.")
            return 0
            
        print(f"  Found metadata for: {metadata['title']}")
        if self._move_file(file_name, metadata, ext):
            return 1
        return 0

    def _extract_slug(self, name):
        # Remove extension
        name = os.path.splitext(name)[0]
        # Remove leading numbers if format is '0001-two-sum'
        match = re.match(r'^\d+-(.+)', name)
        if match:
            return match.group(1)
        return name

    def _move_file(self, src_path, metadata, ext):
        lang = EXT_TO_LANG.get(ext, "other")
        topic = metadata["topicTags"][0]["slug"] if metadata["topicTags"] else "general"
        difficulty = metadata["difficulty"].lower()
        
        # New directory structure: solutions/<language>/<topic>/<difficulty>/
        dest_dir = os.path.join("solutions", lang, topic, difficulty)
        os.makedirs(dest_dir, exist_ok=True)
        
        # New filename: <id>_<problem-name>_<topic>_<difficulty>.<ext>
        problem_id = metadata["questionId"]
        problem_name = metadata["title"].lower().replace(" ", "-")
        new_filename = f"{problem_id}_{problem_name}_{topic}_{difficulty}{ext}"
        dest_path = os.path.join(dest_dir, new_filename)
        
        if os.path.exists(dest_path):
            print(f"Skipping {src_path} as {dest_path} already exists.")
            return False
            
        shutil.move(src_path, dest_path)
        return True

if __name__ == "__main__":
    organizer = Organizer()
    organizer.run()
