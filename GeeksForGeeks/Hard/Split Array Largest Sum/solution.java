class Solution {
    public int splitArray(int[] arr, int k) {
        int low = 0, high = 0;

        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canSplit(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canSplit(int[] arr, int k, int maxSum) {
        int count = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > maxSum) {
                count++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return count <= k;
    }
}