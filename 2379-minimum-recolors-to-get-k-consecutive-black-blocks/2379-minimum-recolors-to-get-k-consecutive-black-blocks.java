class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, count = 0, ans = Integer.MAX_VALUE;
        for (int right = 0; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') count++;

            if (right - left + 1 == k) {
                ans = Math.min(ans, count);

                if (blocks.charAt(left) == 'W') count--;
                left++;
            }
        }
        return ans;
    }
}
