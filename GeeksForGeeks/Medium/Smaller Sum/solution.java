class Solution {
    public long[] smallerSum(int n, int arr[]) {
        long[] ans = new long[n];

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        long[] prefix = new long[n];

        prefix[0] = sorted[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + sorted[i];
        }

        for (int i = 0; i < n; i++) {
            int index = lowerBound(sorted, arr[i]);

            if (index == 0) {
                ans[i] = 0;
            } else {
                ans[i] = prefix[index - 1];
            }
        }

        return ans;
    }

    private int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}