class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // Use long to prevent integer overflow!
            long sum = (long) nums[left] + nums[right];
            
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based
            } else if (sum < target) {
                left++;   // bada number chahiye → left aage
            } else {
                right--;  // chhota number chahiye → right peeche
            }
        }
        
        return new int[]{};
    }
}