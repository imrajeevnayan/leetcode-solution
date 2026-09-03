class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        int low = 0, high = 0;

        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int days = 1, sum = 0;

            for (int x : arr) {
                if (sum + x > mid) {
                    days++;
                    sum = 0;
                }
                sum += x;
            }

            if (days <= d)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }
}
