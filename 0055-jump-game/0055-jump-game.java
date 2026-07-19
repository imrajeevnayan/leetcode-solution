class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums, 0,dp);
    }
    private boolean solve(int[] nums, int i, int[] dp) {
        // Base Cases--
        if (i == nums.length - 1) return true;
        if (i >= nums.length) return false;
        if (nums[i] == 0) return false;

        if (dp[i] != -1)return dp[i] == 1;

        boolean reAns = false;
        for (int jump = 1; jump <= nums[i]; jump++) {
            if (solve(nums, i + jump, dp)) {
                reAns = true;
                break; 
            }
        }
        dp[i] = reAns ? 1 : 0;
        return reAns;
    }
}