class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            // New connected component found
            if (!visited[i]) {
                provinces++;
                Deque<Integer> stack = new ArrayDeque<>();
                stack.push(i);
                visited[i] = true;
                while (!stack.isEmpty()) {
                    int curr= stack.pop();
                    // Check all possible neighbors
                    for (int j = 0; j < n; j++) {

                        if (isConnected[curr][j] == 1  && !visited[j]) {
                            visited[j] = true;
                            stack.push(j);
                        }
                    }
                }
            }
        }
        return provinces;
    }
}
