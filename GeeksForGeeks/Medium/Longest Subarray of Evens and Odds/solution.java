class Solution {
    public static int maxEvenOdd(int[] arr) {
        int ans = 1, curr = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
                curr++;
            else
                curr = 1;

            ans = Math.max(ans, curr);
        }
        return ans;
    }
}