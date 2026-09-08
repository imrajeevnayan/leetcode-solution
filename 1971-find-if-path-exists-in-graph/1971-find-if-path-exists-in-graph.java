class Solution {
    public boolean validPath( int n,int[][] edges,int source, int destination) {
        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // Build undirected graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // Track visited nodes
        boolean[] visited = new boolean[n];

        // Start DFS
        return dfs(source, destination, graph, visited );
    }
    private boolean dfs( int node,int destination,List<List<Integer>> graph, boolean[] visited) {
        // Destination found
        if (node == destination)return true;
        // Mark visited
        visited[node] = true;

        // Visit neighbours
        for (int next : graph.get(node)) {

            if (!visited[next]) {
                if (dfs( next, destination, graph, visited)) return true;  
            }
        }

        return false;
    }
}
