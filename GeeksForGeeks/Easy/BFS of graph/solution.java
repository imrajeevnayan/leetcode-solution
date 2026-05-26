class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        int V = adj.size();
        
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        // start BFS from node 0
        q.add(0);
        visited[0] = true;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node);
            
            for (int nei : adj.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
        
        return result;
    }
}