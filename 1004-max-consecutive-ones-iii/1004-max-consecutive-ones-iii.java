class Solution {
    public int longestOnes(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int left = 0,maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) queue.add(right);
            // More than k zeros
            if (queue.size() > k) {
                left = queue.poll() + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}