class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};  // 1-based index
            } 
            else if (sum < target) left++;     // sum chhota hai → left badhao
            else   right--;    // sum bada hai → right ghatavo
            
        }
        return new int[]{-1, -1}; // yeh case aayega nahi (problem guarantee karti hai)
    }
}