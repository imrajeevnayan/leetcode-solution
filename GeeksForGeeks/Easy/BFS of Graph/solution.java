class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = adj.size();

        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();

        // Start from node 0
        visited[0] = true;
        queue.add(0);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            ans.add(node);

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        return ans;
    }
}
