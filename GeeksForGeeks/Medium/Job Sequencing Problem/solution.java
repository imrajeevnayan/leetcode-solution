class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int[][] jobs = new int[n][2];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        // DSU: parent[i] points to the latest available slot <= i
        int[] parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int count = 0, totalProfit = 0;

        for (int[] job : jobs) {
            int availableSlot = find(parent, Math.min(maxDeadline, job[0]));
            if (availableSlot > 0) {
                parent[availableSlot] = find(parent, availableSlot - 1);
                count++;
                totalProfit += job[1];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(count);
        result.add(totalProfit);
        return result;
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]); // Path compression
        }
        return parent[x];
    }
}