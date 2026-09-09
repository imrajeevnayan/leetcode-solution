class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {

            // New unvisited node = new province
            if (!visited[i]) {
                provinces++;
                Queue<Integer> queue = new ArrayDeque<>();
                queue.offer(i);
                visited[i] = true;
                while (!queue.isEmpty()) {
                    int curr = queue.poll();
                    // Check all possible neighbors
                    for (int j = 0; j < n; j++) {

                        if (isConnected[curr][j] == 1 && !visited[j]) {
                            visited[j] = true;
                            queue.offer(j);
                        }
                    }
                }
            }
        }
        return provinces;
    }
}
