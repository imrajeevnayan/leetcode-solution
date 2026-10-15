class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        // Pehli window ka sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Slide karo
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Add new, remove old
            maxSum = Math.max(maxSum, sum); // Max update
        }
        
        return maxSum / k;
    }
}