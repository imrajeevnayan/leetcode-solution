class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        
        // Slide a window of size 3 across the array
        for (int i = 0; i <= nums.length - 3; i++) {
            int a = nums[i];       // first element
            int b = nums[i + 1];   // middle element
            int c = nums[i + 2];   // last element
            
            // Check: sum of first and last == half of middle
            // Use multiplication to avoid floating point issues
            if (2L * (a + c) == b) {
                count++;
            }
        }
        
        return count;
    }
}