import json
import os
from datetime import datetime, date

class StreakTracker:
    def __init__(self, stats_path="stats/streak.json"):
        self.stats_path = stats_path
        self.stats = self._load_stats()

    def _load_stats(self):
        if os.path.exists(self.stats_path):
            with open(self.stats_path, 'r') as f:
                return json.load(f)
        return {
            "currentStreak": 0,
            "longestStreak": 0,
            "lastSolvedDate": None,
            "dailyCount": {}
        }

    def update_streak(self, solved_count):
        if solved_count == 0:
            return

        today = date.today().isoformat()
        last_date_str = self.stats.get("lastSolvedDate")
        
        # Update daily count
        self.stats["dailyCount"][today] = self.stats["dailyCount"].get(today, 0) + solved_count

        if last_date_str:
            last_date = datetime.fromisoformat(last_date_str).date()
            diff = (date.today() - last_date).days
            
            if diff == 0:
                # Already solved today, streak remains same
                pass
            elif diff == 1:
                # Consecutive day
                self.stats["currentStreak"] += 1
            else:
                # Gap detected
                self.stats["currentStreak"] = 1
        else:
            # First time
            self.stats["currentStreak"] = 1

        # Update longest streak
        if self.stats["currentStreak"] > self.stats["longestStreak"]:
            self.stats["longestStreak"] = self.stats["currentStreak"]

        self.stats["lastSolvedDate"] = today
        self._save_stats()

    def _save_stats(self):
        os.makedirs(os.path.dirname(self.stats_path), exist_ok=True)
        with open(self.stats_path, 'w') as f:
            json.dump(self.stats, f, indent=4)

if __name__ == "__main__":
    tracker = StreakTracker()
    tracker.update_streak(1)
    print(tracker.stats)
