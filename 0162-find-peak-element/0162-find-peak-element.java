class Solution {
    public int findPeakElement(int[] nums) {
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[ans]) {
                ans = i;
            }
        }

        return ans;
    }
}