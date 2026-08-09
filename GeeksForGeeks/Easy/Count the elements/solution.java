class Solution {
    public static int[] countElements(int a[], int b[], int n, int query[], int q) {

        int[] ans = new int[q];

        Arrays.sort(b);

        for (int i = 0; i < q; i++) {
            int x = a[query[i]];

            int low = 0;
            int high = n - 1;
            int count = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (b[mid] <= x) {
                    count = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}