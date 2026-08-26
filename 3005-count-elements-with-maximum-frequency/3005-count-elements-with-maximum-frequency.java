class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0, ans = 0;

        for (int x : nums)  freq[x]++;
        for (int x : freq) max = Math.max(max, x);

        for (int x : freq)
            if (x == max) ans += x;

        return ans;
    }
}
