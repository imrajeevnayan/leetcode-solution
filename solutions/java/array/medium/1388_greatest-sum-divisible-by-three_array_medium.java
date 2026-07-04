class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        
        for (int num : nums) {
            int[] temp = dp.clone();
            for (int i = 0; i < 3; i++) {
                if (temp[i] == Integer.MIN_VALUE) continue;
                
                int newSum = temp[i] + num;
                int rem = newSum % 3;
                
                dp[rem] = Math.max(dp[rem], newSum);
            }
        }
        return dp[0];
    }
}