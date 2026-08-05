class Solution {
    public long[] findElements(long arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        long[] ans = new long[n - 2];
        for (int i = 0; i < n - 2; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}