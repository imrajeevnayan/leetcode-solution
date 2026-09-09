class Solution {
    public boolean isCycle(int V, int[][] edges) {

        // 1. Adjacency List
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // 2. Undirected graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 3. Visited array
        boolean[] visited = new boolean[V];

        // 4. Handle disconnected components
        for (int i = 0; i < V; i++) {

            if (visited[i]) {
                continue;
            }

            Queue<int[]> queue = new ArrayDeque<>();

            visited[i] = true;

            // {current node, parent}
            queue.offer(new int[]{i, -1});

            // 5. BFS
            while (!queue.isEmpty()) {

                int[] current = queue.poll();

                int node = current[0];
                int parent = current[1];

                for (int neighbor : graph.get(node)) {

                    // New node
                    if (!visited[neighbor]) {

                        visited[neighbor] = true;

                        queue.offer(new int[]{
                            neighbor,
                            node
                        });
                    }

                    // Already visited AND not parent
                    else if (neighbor != parent) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
