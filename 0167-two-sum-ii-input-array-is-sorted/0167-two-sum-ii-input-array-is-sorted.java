class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // 1-based index return karna hai
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // Sum chota hai, bada number chahiye
            } else {
                right--; // Sum bada hai, chota number chahiye
            }
        }
        return new int[]{-1, -1};
    }
}