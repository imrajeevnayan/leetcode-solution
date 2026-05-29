class Solution {
    public int kthMissing(int[] arr, int k) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] - (mid + 1) < k) l = mid + 1;
            else h = mid;
        }
        return l + k;
    }
}