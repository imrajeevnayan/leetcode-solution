class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                provinces++;
                bfs(i, isConnected, visited);
            }
        }
        return provinces;
    }
    private void bfs(int start, int[][] isConnected, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int city = queue.poll();
            // Current city ke saare possible connections check karo
            for (int j = 0; j < isConnected.length; j++) {

                if (isConnected[city][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
    }
}
