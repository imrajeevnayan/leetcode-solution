class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);   // pehle sort kar lo
        
        int left = 0, right = nums.length - 1;
        double minAverage = Double.MAX_VALUE;
        
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            minAverage = Math.min(minAverage, avg);
            
            left++;
            right--;
        }
        
        return minAverage;
    }
}