class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, currentHeight * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}