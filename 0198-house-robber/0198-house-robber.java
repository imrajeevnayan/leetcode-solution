class Solution {
int[] dp;
public int rob(int[] nums) {
   dp= new int[nums.length];
    Arrays.fill(dp, -1);
    return helper(nums, 0);
}

private int helper(int[] nums, int i) {
    if (i >= nums.length) return 0;
    if (dp[i] != -1) return dp[i];
    
    return dp[i] = Math.max(nums[i] + helper(nums, i + 2), helper(nums, i + 1));
    
}
}