class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int width = j - i;
            int area = h * width;
            max = Math.max(max, area);

            // move smaller height
            if (height[i] < height[j])  i++;
            else j--;
        }
        return max;
    }
}