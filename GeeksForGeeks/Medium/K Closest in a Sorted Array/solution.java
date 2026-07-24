class Solution {
    int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1,ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } 
            else low = mid + 1;
        }
        return ans;
    }
    int[] printKClosest(int[] arr, int k, int x) {
        int n = arr.length;
        int[] res = new int[k];
        int right = upperBound(arr, x);
        int left = right - 1;
        int idx = 0;

        while (k > 0) {
            while (left >= 0 && arr[left] == x)left--;
            while (right < n && arr[right] == x) right++;
            if (left < 0) res[idx++] = arr[right++];
            else if (right >= n)res[idx++] = arr[left--];
            else {
                int leftDiff = Math.abs(arr[left] - x);
                int rightDiff = Math.abs(arr[right] - x);

                if (leftDiff < rightDiff) {
                    res[idx++] = arr[left--];
                }
                else {
                    // If equal distance, choose larger element
                    res[idx++] = arr[right++];
                }
            }
            k--;
        }
        return res;
    }
}