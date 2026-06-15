class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (a, b) -> 
            Double.compare((double) val[b] / wt[b], (double) val[a] / wt[a])
        );

        double totalValue = 0.0;

        for (int i : idx) {
            if (capacity >= wt[i]) {
                totalValue += val[i];
                capacity -= wt[i];
            } else {
                totalValue += ((double) val[i] / wt[i]) * capacity;
                break;
            }
        }

        return totalValue;
    }
}