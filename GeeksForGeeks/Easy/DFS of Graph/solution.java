class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfsHelper(0, adj, vis, ans);
        return ans;
    }
    private void dfsHelper(int node,
                           ArrayList<ArrayList<Integer>> adj,
                           boolean[] vis,
                           ArrayList<Integer> ans) {

        vis[node] = true;
        ans.add(node);
        for (int nbr : adj.get(node)) {
            if (!vis[nbr]) {
                dfsHelper(nbr, adj, vis, ans);
            }
        }
    }
}