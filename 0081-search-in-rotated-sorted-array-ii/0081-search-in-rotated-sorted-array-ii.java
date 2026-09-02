class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0,high = nums.length - 1,ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Target found
            if (nums[mid] == target) {
                ans = mid;
                break;
            }
            // Duplicate ambiguity
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;

            }
            // Left half sorted
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) high = mid - 1;
                else low = mid + 1;
            }
            // Right half sorted
            else {
                if (nums[mid] < target && target <= nums[high]) low = mid + 1;
               else high = mid - 1;
            }
        }
        return ans != -1;
    }
}
