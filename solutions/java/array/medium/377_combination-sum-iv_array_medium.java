class Solution {
    static int solve(int amount, int[] coins, int[] dp) {
        if (amount == 0) return 1;
        if (amount < 0) return 0;
        if (dp[amount] != -1) return dp[amount];
        int totalWays = 0;
        for (int c : coins) {
            totalWays += solve(amount - c, coins, dp);
        }
        return dp[amount] = totalWays;
    }
    public int combinationSum4(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        return solve(amount, coins, dp);
    }
}