class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        int[][] directions = {
            {-1, 0},   // up
            {1, 0},    // down
            {0, -1},   // left
            {0, 1}     // right
        };

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                // Water hai → skip
                if (grid[r][c] == '0') {
                    continue;
                }

                // New island found
                islands++;

                Queue<int[]> queue = new ArrayDeque<>();

                // Starting cell ko queue mein daalo
                queue.offer(new int[]{r, c});

                // Mark as visited
                grid[r][c] = '0';

                while (!queue.isEmpty()) {

                    int[] current = queue.poll();

                    int currentRow = current[0];
                    int currentCol = current[1];

                    // 4 directions check karo
                    for (int[] direction : directions) {

                        int newRow = currentRow + direction[0];
                        int newCol = currentCol + direction[1];

                        // Boundary check
                        if (newRow < 0 || newRow >= rows ||
                            newCol < 0 || newCol >= cols) {
                            continue;
                        }

                        // Water hai → skip
                        if (grid[newRow][newCol] == '0') {
                            continue;
                        }

                        // Land mila → visit karo
                        grid[newRow][newCol] = '0';

                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }

        return islands;
    }
}
