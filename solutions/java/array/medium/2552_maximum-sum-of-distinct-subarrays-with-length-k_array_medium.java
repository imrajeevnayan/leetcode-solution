class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;

        for (int right = 0; right < k; right++) {
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
        }
        long max = 0;
        if (map.size() == k)  max = sum;
        for (int right = k; right < nums.length; right++) {
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);


            // Remove left element
            int left = nums[right - k];
            sum -= left;

            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0)
                map.remove(left);


            // Check distinct
            if (map.size() == k)
                max = Math.max(max, sum);
        }

        return max;
    }
}