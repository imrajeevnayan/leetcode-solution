class Solution {
    private int helper(int n, int[] dp) {
        // Base Case
        if (n <= 1) return n;
        
        // Step 1: Check if already calculated
        if (dp[n] != -1)  return dp[n];
    
        // Step 2: Calculate and Store
        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];
    }
    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
}