class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left =0,maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int number = nums[right];
            map.put(number,map.getOrDefault(number, 0) + 1);
            while (map.get(number) > k) {
                int leftNumber = nums[left];
                map.put(leftNumber,map.get(leftNumber) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1 );
        }
        return maxLength;
    }
}
