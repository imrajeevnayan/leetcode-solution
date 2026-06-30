class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != sorted[i]) {
                if (start == -1) start = i;
                end = i;
            }
        }
        return start == -1 ? 0 : end - start + 1;
    }
}