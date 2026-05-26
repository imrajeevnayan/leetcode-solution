class Solution {
    public int maxWater(int arr[]) {
        if (arr == null || arr.length == 0)  return 0;
        int left = 0,right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left <= right) {
            if (leftMax <= rightMax) {
                if (arr[left] < leftMax) {
                    water += leftMax - arr[left];
                } else {
                    leftMax = arr[left];
                }
                left++;
            } else {
                if (arr[right] < rightMax) {
                    water += rightMax - arr[right];
                } else {
                    rightMax = arr[right];
                }
                right--;
            }
        }
        return water;
    }
}