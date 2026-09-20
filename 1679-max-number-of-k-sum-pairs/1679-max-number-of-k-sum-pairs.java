class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int count = 0;
        
        while (left < right) {
            long sum = (long) nums[left] + nums[right]; // overflow safe
            
            if (sum == k) {
                count++;
                left++;
                right--;      // Both used, move both
            } else if (sum < k) {
                left++;       // Need bigger sum
            } else {
                right--;      // Need smaller sum
            }
        }
        
        return count;
    }
}