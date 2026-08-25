class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(arr[a[0]] * arr[b[1]], arr[b[0]] * arr[a[1]])
        );

        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        for (int i = 1; i < k; i++) {
            int[] cur = pq.poll();

            if (cur[0] + 1 < cur[1]) {
                pq.offer(new int[]{cur[0] + 1, cur[1]});
            }
        }
        int[] ans = pq.peek();
        return new int[]{arr[ans[0]], arr[ans[1]]};
    }
}
