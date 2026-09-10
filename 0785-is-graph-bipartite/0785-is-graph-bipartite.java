class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        // 0 = uncolored
        // 1 = Red
        // 2 = Blue
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {

            // Already visited / colored
            if (color[i] != 0) continue;

            // Start a new connected component
            Queue<Integer> q = new LinkedList<>();

            color[i] = 1;
            q.offer(i);

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int neighbor : graph[node]) {

                    // Neighbor is uncolored
                    if (color[neighbor] == 0) {

                        // Give opposite color
                        color[neighbor] = 3 - color[node];

                        q.offer(neighbor);
                    }

                    // Conflict: both have same color
                    else if (color[neighbor] == color[node]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
