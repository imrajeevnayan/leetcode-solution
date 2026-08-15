class Solution {
    public int maxCircularSum(int arr[]) {
        int sum = 0;
        int max = arr[0], curMax = 0;
        int min = arr[0], curMin = 0;

        for (int x : arr) {
            curMax = Math.max(x, curMax + x);
            max = Math.max(max, curMax);

            curMin = Math.min(x, curMin + x);
            min = Math.min(min, curMin);

            sum += x;
        }

        if (max < 0)
            return max;

        return Math.max(max, sum - min);
    }
}