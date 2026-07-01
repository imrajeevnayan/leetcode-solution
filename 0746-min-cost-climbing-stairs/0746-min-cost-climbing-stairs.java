class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(cost, n, dp);
    }
    
    private int helper(int[] cost, int i, int[] dp) {
        if (i <= 1) return 0;
        if (dp[i] != -1) return dp[i];
        dp[i] = Math.min(
            helper(cost, i - 1, dp) + cost[i - 1],
            helper(cost, i - 2, dp) + cost[i - 2]
        );
        
        return dp[i];
    }
}