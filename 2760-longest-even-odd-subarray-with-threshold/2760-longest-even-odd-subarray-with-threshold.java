class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLen = 0, currLen = 0;

        for (int i = 0; i < nums.length; i++) {
            // Reset if element exceeds threshold
            if (nums[i] > threshold) {
                currLen = 0;
                continue;
            }

            // Start new subarray if current length is 0 and element is even
            if (currLen == 0) {
                if (nums[i] % 2 == 0) {
                    currLen = 1;
                }
            } 
            // Extend existing subarray if alternating pattern holds
            else if ((nums[i] + nums[i - 1]) % 2 != 0) {
                currLen++;
            } 
            // Pattern broken: Check if new subarray can start with current even element
            else {
                currLen = (nums[i] % 2 == 0) ? 1 : 0;
            }

            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}