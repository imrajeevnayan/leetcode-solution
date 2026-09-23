class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        // Hum index 0 ya 1 se shuru kar sakte hain, toh dono ka min lelo
        return Math.min(helper(cost, 0, dp), helper(cost, 1, dp));
    }
    
    private int helper(int[] cost, int i, int[] dp) {
        int n = cost.length;
        // Base Case: Agar index array se bahar chala gaya, toh cost 0 hai
        if (i >= n) return 0;
        // Memoization Check: Agar pehle se calculate hai, toh direct return karo
        if (dp[i] != -1) return dp[i];
        // Choice 1: 1 step upar jao
        int oneStep = cost[i] + helper(cost, i + 1, dp);
        
        // Choice 2: 2 steps upar jao
        int twoSteps = cost[i] + helper(cost, i + 2, dp);
        
        // Dono mein se minimum cost ko dp mein store karo
        dp[i] = Math.min(oneStep, twoSteps);
        
        return dp[i];
    }
}