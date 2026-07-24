class Solution {
    public static int findClosest(int[] arr, int k) {
        int n = arr.length,low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k)  return arr[mid];
            if (arr[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        // k is smaller than all elements
        if (high < 0)  return arr[0];

        // k is greater than all elements
        if (low >= n) return arr[n - 1];

        int leftDiff = k - arr[high];
        int rightDiff = arr[low] - k;

        if (leftDiff < rightDiff) return arr[high];
        else  return arr[low];   // returns larger element if equal
    }
}