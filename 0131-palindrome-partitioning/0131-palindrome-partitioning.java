class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        int n = s.length();

        boolean[][] dp = new boolean[n][n];

        // Precompute palindrome substrings
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && 
                    (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                }
            }
        }

        backtrack(s, 0, dp, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(String s, int start, boolean[][] dp,
                           List<String> path, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (dp[start][end]) {
                path.add(s.substring(start, end + 1));
                backtrack(s, end + 1, dp, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }
}