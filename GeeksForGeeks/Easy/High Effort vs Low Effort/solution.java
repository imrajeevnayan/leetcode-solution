class Solution {
    public int maxTask(int[] h, int[] l) {
        int n = h.length;
        int prev2 = 0;
        int prev1 = 0;

        for (int i = 0; i < n; i++) {
            int low = prev1 + l[i];
            int high = prev2 + h[i];
            int current = Math.max(low, high);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}