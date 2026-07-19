class Solution {
    public int findKthSmall(int[] arr, int k) {
        Arrays.sort(arr);

        int prev = 0;

        for (int i = 0; i < arr.length; i++) {
            // Skip duplicates
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int missing = arr[i] - prev - 1;

            if (k <= missing)
                return prev + k;

            k -= missing;
            prev = arr[i];
        }

        // If not found before the last element
        return prev + k;
    }
}