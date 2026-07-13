class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        long[] prefixSums = new long[n + 1];
        for (int i = 0; i < n; i++) prefixSums[i + 1] = prefixSums[i] + nums[i];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            while (!dq.isEmpty() && prefixSums[i] - prefixSums[dq.peekFirst()] >= k) {
                minLen = Math.min(minLen, i - dq.pollFirst());
            }
            while (!dq.isEmpty() && prefixSums[i] <= prefixSums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}