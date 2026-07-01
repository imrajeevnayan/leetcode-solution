class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dist = new int[n][n];
        
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    queue.offer(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }
        
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];
            
            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
        
        int left = 0, right = 0;
        for (int[] row : dist) {
            for (int d : row) {
                right = Math.max(right, d);
            }
        }
        
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (canReach(dist, n, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
    
    private boolean canReach(int[][] dist, int n, int minSafe) {
        if (dist[0][0] < minSafe || dist[n-1][n-1] < minSafe) {
            return false;
        }
        
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];
            
            if (r == n - 1 && c == n - 1) {
                return true;
            }
            
            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc] && dist[nr][nc] >= minSafe) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
        
        return false;
    }
}