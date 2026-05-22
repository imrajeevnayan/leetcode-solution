class Solution {
    public long count(int coins[], int sum) {
        int n = coins.length;
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        
        for (int i = 0; i < n; i++) {
            int coin = coins[i];
           for (int j = coin; j <= sum; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[sum];
    }
}