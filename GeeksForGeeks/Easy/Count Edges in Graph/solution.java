class Solution {
    public int countEdges(ArrayList<ArrayList<Integer>> adj) {

        int total = 0;

        for (int i = 0; i < adj.size(); i++) {
            total += adj.get(i).size();
        }

        return total / 2;
    }
}
