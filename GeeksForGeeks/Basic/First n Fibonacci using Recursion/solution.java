class Solution {
    public static int[] fibonacciNumbers(int n) {
        if (n <= 0) return new int[0];
        if (n == 1) return new int[]{0};
        int[] dp = new int[n];
        dp[0] = 0; 
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
}