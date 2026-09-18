class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);                 
        Set<Double> set = new HashSet<>();  // distinct averages store karne ke liye
        
        int left = 0, right = nums.length - 1;
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }
}