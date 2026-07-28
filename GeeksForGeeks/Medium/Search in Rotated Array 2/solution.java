class Solution {
    public boolean search(int[] arr, int key) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == key)
                return true;

            // Handle duplicates
            if (arr[l] == arr[mid] && arr[mid] == arr[r]) {
                l++;
                r--;
            }
            // Left half sorted
            else if (arr[l] <= arr[mid]) {
                if (arr[l] <= key && key < arr[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            // Right half sorted
            else {
                if (arr[mid] < key && key <= arr[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }

        return false;
    }
}