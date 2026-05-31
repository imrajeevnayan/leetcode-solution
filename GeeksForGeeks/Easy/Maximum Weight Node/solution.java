class Solution {
    public int maxWeightCell(int[] exits) {
        int n = exits.length;
        long[] weight = new long[n];

        for (int i = 0; i < n; i++) {
            if (exits[i] != -1) {
                weight[exits[i]] += i;
            }
        }

        long maxWeight = -1;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (weight[i] >= maxWeight) { 
                maxWeight = weight[i];
                ans = i;
            }
        }

        return ans;
    }
}