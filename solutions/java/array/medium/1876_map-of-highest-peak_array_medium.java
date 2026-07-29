class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;

        int[][] ans = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    q.offer(new int[]{i, j});
                } else {
                    ans[i][j] = -1; // unvisited land
                }
            }
        }

        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int[] d : dir) {
                int nr = cur[0] + d[0];
                int nc = cur[1] + d[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && ans[nr][nc] == -1) {
                    ans[nr][nc] = ans[cur[0]][cur[1]] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return ans;
    }
}