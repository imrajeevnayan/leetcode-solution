class NumArray {
    int[] ans;

    public NumArray(int[] nums) {
        int n = nums.length;
        ans = new int[n + 1];

        for (int i = 0; i < n; i++) {
            ans[i + 1] = ans[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return ans[right + 1] - ans[left];
    }
}
