class Solution {
    public int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : new int[]{3, 5, 10}) {
            for (int i = coin; i <= n; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[n];
    }
}