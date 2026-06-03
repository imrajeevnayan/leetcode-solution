class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        
        // Find all rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        // If no fresh oranges, return 0
        if (freshCount == 0) return 0;
        
        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int minutes = 0;
        
        // BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            
            // Process all oranges at current level (current minute)
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                
                // Check all 4 directions
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    
                    // If valid position and fresh orange
                    if (newRow >= 0 && newRow < rows && 
                        newCol >= 0 && newCol < cols && 
                        grid[newRow][newCol] == 1) {
                        
                        grid[newRow][newCol] = 2; // Mark as rotten
                        queue.offer(new int[]{newRow, newCol});
                        freshCount--;
                        rotted = true;
                    }
                }
            }
            
            // If any oranges rotted in this minute, increment time
            if (rotted) {
                minutes++;
            }
        }
        
        // If there are still fresh oranges, return -1
        return freshCount == 0 ? minutes : -1;
    }
}