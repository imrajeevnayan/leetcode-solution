import requests
import json

class LeetCodeClient:
    GRAPHQL_URL = "https://leetcode.com/graphql"
    
    def fetch_problem_metadata(self, title_slug):
        query = """
        query questionData($titleSlug: String!) {
            question(titleSlug: $titleSlug) {
                questionId
                title
                difficulty
                topicTags {
                    name
                    slug
                }
            }
        }
        """
        variables = {"titleSlug": title_slug}
        try:
            response = requests.post(
                self.GRAPHQL_URL,
                json={"query": query, "variables": variables},
                timeout=10
            )
            response.raise_for_status()
            data = response.json()
            if "data" in data and data["data"]["question"]:
                return data["data"]["question"]
        except Exception as e:
            print(f"Error fetching metadata for {title_slug}: {e}")
        return None

if __name__ == "__main__":
    # Test
    client = LeetCodeClient()
    print(client.fetch_problem_metadata("two-sum"))
