class Solution {
    public double medianOf2(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        int total = n + m;
        int mid = total / 2;

        for (int k = 0; k <= mid; k++) {
            prev = curr;

            if (i < n && (j >= m || a[i] <= b[j])) {
                curr = a[i];
                i++;
            } else {
                curr = b[j];
                j++;
            }
        }

        if (total % 2 == 0) {
            return (prev + curr) / 2.0;
        } else {
            return curr;
        }
    }
}