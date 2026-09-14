class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        if (2 * k + 1 > n) return ans;

        long sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            if (right - left + 1 == 2 * k + 1) {
                int mid = left + k;

                ans[mid] = (int)(sum / (2 * k + 1));

                sum -= nums[left];
                left++;
            }
        }

        return ans;
    }
}
