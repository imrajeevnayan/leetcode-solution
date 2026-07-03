class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        int MOD = 1000000007;
        
        // We need n+1 terms because it's 0-based indexing (0 to n)
        long[] dp = new long[n + 1];
        
        // Base Cases
        dp[0] = 0;
        if (n >= 1) {
            dp[1] = 1;
        }
        
        // Fill the DP table
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        
        // Convert long array to ArrayList<Integer>
        for (int i = 0; i <= n; i++) {
            fib.add((int) dp[i]);
        }
        
        return fib;
    }
}