class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i] + nums[i - 1];

            if (!set.add(sum))
                return true;
        }

        return false;
    }
}
