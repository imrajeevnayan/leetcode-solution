class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            // Check whether u and v are already connected
            if (hasPath(graph, u, v, n)) return edge;
            
            // No cycle, so add this edge
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return new int[0];
    }

    private boolean hasPath(
        List<List<Integer>> graph,
        int source,
        int destination,
        int n
    ) {

        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == destination) {
                return true;
            }

            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }
}
