class Solution {
    public int[] findSum(int n) {
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        return new int[]{odd, even};
    }
}