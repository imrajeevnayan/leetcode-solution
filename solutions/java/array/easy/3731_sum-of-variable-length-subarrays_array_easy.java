class Solution {
    public int subarraySum(int[] nums) {
         int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            result += prefix[i + 1] - prefix[start];
        }
        return result;
        
    }
}