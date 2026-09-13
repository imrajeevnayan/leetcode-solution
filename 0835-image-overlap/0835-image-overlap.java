class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        int[][] a = new int[n * n][2];
        int[][] b = new int[n * n][2];

        int ca = 0, cb = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (img1[i][j] == 1) {
                    a[ca++] = new int[]{i, j};
                }
                if (img2[i][j] == 1) {
                    b[cb++] = new int[]{i, j};
                }
            }
        }
        // Shift range is -(n-1) to +(n-1)
        int[][] count = new int[2 * n - 1][2 * n - 1];

        int ans = 0;

        for (int i = 0; i < ca; i++) {
            for (int j = 0; j < cb; j++) {

                int dx = b[j][0] - a[i][0];
                int dy = b[j][1] - a[i][1];

                int x = dx + n - 1;
                int y = dy + n - 1;

                count[x][y]++;

                ans = Math.max(ans, count[x][y]);
            }
        }

        return ans;
    }
}
