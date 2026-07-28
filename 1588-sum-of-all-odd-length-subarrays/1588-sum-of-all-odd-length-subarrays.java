class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - i;
            int totalSubarrays = left * right;
            int oddCount = (totalSubarrays + 1) / 2;
            result += arr[i] * oddCount;
        }
        return result;
    }
}