class Solution {
    static int smallestSumSubarray(int[] a, int size) {
        int curr = 0, ans = Integer.MAX_VALUE;
        for (int x : a) {
            curr += x;
            ans = Math.min(ans, curr);
            if (curr > 0) curr = 0;
        }
        return ans;
    }
}