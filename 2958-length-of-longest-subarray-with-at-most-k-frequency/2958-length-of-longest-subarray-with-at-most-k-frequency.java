class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLength = 0;
        Map<Integer, Integer> count = new HashMap<>();
        while (right < nums.length) {
            int number = nums[right];
            count.put(number, count.getOrDefault(number, 0) + 1);

            while (count.get(number) > k) {
                count.put(nums[left], count.get(nums[left]) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}