class Solution {
    int solve(int i, int[] nums, int end, int[] dp) {
        if (i > end) return 0;
        if (dp[i] != -1)return dp[i];

        int take = nums[i] + solve(i + 2, nums, end, dp);
        int skip = solve(i + 1, nums, end, dp);

        return dp[i] = Math.max(take, skip);
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = solve(0, nums, n - 2, dp1);
        int case2 = solve(1, nums, n - 1, dp2);

        return Math.max(case1, case2);
    }
}
