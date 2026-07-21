class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);
        int[] points = new int[max + 1];
        for (int x : nums) points[x] += x;
        int[] dp = new int[max + 1];
        dp[0] = points[0];
        if (max >= 1) dp[1] = Math.max(points[0], points[1]);
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }
        return dp[max];
    }
}
