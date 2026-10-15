class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = Integer.MIN_VALUE; // Shuru mein sabse chota value
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Element add karo
            
            // Jab window size K ho jaye
            if (i >= k - 1) {
                // Max sum update karo
                if (sum > maxSum) {
                    maxSum = sum;
                }
                // Left element ko hata do taaki window slide kare
                sum -= nums[i - k + 1];
            }
        }
        
        return maxSum / k;
    }
}