class Solution {
    public int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {

            int left = 0;
            int right = k - 1;

            while (left < right) {

                if (arr[left] + arr[right] > arr[k]) {

                    count += (right - left);
                    right--;

                } else {

                    left++;
                }
            }
        }

        return count;

    }
}