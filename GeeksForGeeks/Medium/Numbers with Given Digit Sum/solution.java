class Solution {
    int n;
    int[][] dp;
    int solve(int pos, int sum) {
        if (sum < 0)  return 0;
        if (pos == n)  return sum == 0 ? 1 : 0;
    
        if (dp[pos][sum] != -1) return dp[pos][sum];

        int start = (pos == 0) ? 1 : 0;
        int ans = 0;
        for (int digit = start; digit <= 9; digit++) {
            ans += solve(pos + 1, sum - digit);
        }
        dp[pos][sum] = ans;
        return ans;
    }
    public int countWays(int n, int sum) {
        this.n = n;
        dp = new int[n][sum + 1];
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }
        int ans = solve(0, sum);
        return ans == 0 ? -1 : ans;
    }
}