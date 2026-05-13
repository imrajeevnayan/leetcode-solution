import os
import json

class ReadmeGenerator:
    def __init__(self, solutions_dir="solutions", stats_path="stats/streak.json"):
        self.solutions_dir = solutions_dir
        self.stats_path = stats_path

    def generate(self):
        stats = self._load_stats()
        problems = self._scan_solutions()
        
        content = "# LeetCode AI Organizer v2 🚀\n\n"
        content += "Automatically organized collection of LeetCode solutions.\n\n"
        
        # Stats Section
        content += "## 📊 Statistics\n\n"
        content += f"- **Total Problems Solved:** {len(problems)}\n"
        content += f"- **Current Streak:** {stats.get('currentStreak', 0)} days\n"
        content += f"- **Longest Streak:** {stats.get('longestStreak', 0)} days\n\n"
        
        # Breakdown
        content += "### 🧩 Breakdown\n\n"
        lang_stats = {}
        topic_stats = {}
        for p in problems:
            lang_stats[p['lang']] = lang_stats.get(p['lang'], 0) + 1
            topic_stats[p['topic']] = topic_stats.get(p['topic'], 0) + 1
        
        content += "#### By Language\n"
        for lang, count in lang_stats.items():
            content += f"- {lang.capitalize()}: {count}\n"
        
        content += "\n#### By Topic\n"
        for topic, count in topic_stats.items():
            content += f"- {topic.capitalize()}: {count}\n"
        
        # Problems Table
        content += "\n## 📂 Solutions\n\n"
        content += "| ID | Title | Topic | Difficulty | Language | Link |\n"
        content += "|----|-------|-------|------------|----------|------|\n"
        
        # Sort problems by ID
        sorted_problems = sorted(problems, key=lambda x: int(x['id']) if x['id'].isdigit() else 0)
        
        for p in sorted_problems:
            rel_path = p['path'].replace("\\", "/")
            content += f"| {p['id']} | {p['title']} | {p['topic']} | {p['difficulty']} | {p['lang']} | [Solution]({rel_path}) |\n"
            
        with open("README.md", "w", encoding="utf-8") as f:
            f.write(content)

    def _load_stats(self):
        if os.path.exists(self.stats_path):
            with open(self.stats_path, 'r') as f:
                return json.load(f)
        return {}

    def _scan_solutions(self):
        problems = []
        if not os.path.exists(self.solutions_dir):
            return problems
            
        for root, dirs, files in os.walk(self.solutions_dir):
            for file in files:
                if file.endswith(('.py', '.java', '.cpp', '.sql', '.js', '.ts')):
                    path = os.path.relpath(os.path.join(root, file), ".")
                    # Format: <id>_<name>_<topic>_<diff>.<ext>
                    parts = file.rsplit(".", 1)[0].split("_")
                    if len(parts) >= 4:
                        problems.append({
                            "id": parts[0],
                            "title": parts[1].replace("-", " ").title(),
                            "topic": parts[2],
                            "difficulty": parts[3],
                            "lang": root.split(os.sep)[1],
                            "path": path
                        })
        return problems

if __name__ == "__main__":
    gen = ReadmeGenerator()
    gen.generate()
