class Solution {
    public int countMinOperations(int arr[]) {
        int ans = 0;
        int n = arr.length;

        while (true) {
            int zero = 0;
            int i;

            // Find first odd element
            for (i = 0; i < n; i++) {
                if (arr[i] % 2 == 1)
                    break;
                if (arr[i] == 0)
                    zero++;
            }

            // All elements are 0
            if (zero == n)
                return ans;

            // If all are even, divide by 2
            if (i == n) {
                for (int j = 0; j < n; j++)
                    arr[j] /= 2;
                ans++;
            }

            // Make odd elements even
            for (int j = i; j < n; j++) {
                if (arr[j] % 2 == 1) {
                    arr[j]--;
                    ans++;
                }
            }
        }
    }
}