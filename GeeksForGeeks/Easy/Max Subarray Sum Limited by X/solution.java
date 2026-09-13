class Solution {
    public int maxSum(int[] arr, int x) {
        int left = 0;
        long sum = 0;
        long ans = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > x && left <= right) {
                sum -= arr[left++];
            }

            ans = Math.max(ans, sum);
        }

        return (int) ans;
    }
}
