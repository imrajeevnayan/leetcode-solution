class Solution {
    public ArrayList<Integer> findSmallestRange(int[][] mat) {
        int k = mat.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            pq.add(new int[]{mat[i][0], i, 0});
            max = Math.max(max, mat[i][0]);
        }

        int start = 0, end = Integer.MAX_VALUE;

        while (true) {
            int[] cur = pq.poll();
            int min = cur[0];

            if (max - min < end - start) {
                start = min;
                end = max;
            }

            int row = cur[1], col = cur[2];

            if (col + 1 == mat[row].length) break;

            int next = mat[row][col + 1];
            pq.add(new int[]{next, row, col + 1});
            max = Math.max(max, next);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(end);

        return ans;
    }
}