class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();
        
        // dist[i][j] stores the minimum damage taken to reach cell (i, j)
        int[][] dist = new int[n][m];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Priority Queue: {damage, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Start at (0, 0)
        dist[0][0] = grid.get(0).get(0);
        pq.offer(new int[]{dist[0][0], 0, 0});
        
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], r = curr[1], c = curr[2];
            
            // If we reached the destination
            if (r == n - 1 && c == m - 1) {
                return d < health;
            }
            
            // If we already found a better way to this cell, skip
            if (d > dist[r][c]) continue;
            
            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int newDamage = d + grid.get(nr).get(nc);
                    
                    if (newDamage < dist[nr][nc]) {
                        dist[nr][nc] = newDamage;
                        pq.offer(new int[]{newDamage, nr, nc});
                    }
                }
            }
        }
        
        return false;
    }
}