class Solution {
    public int findMin(int[] arr) {
        int left = 0,right = arr.length - 1,ans = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                // Minimum right side mein hai
                left = mid + 1;
            } else {

                // arr[mid] minimum ka candidate hai
                ans = Math.min(ans, arr[mid]);

                // Aur chhota left mein ho sakta hai
                right = mid - 1;
            }
        }
        return ans;
    }
}
