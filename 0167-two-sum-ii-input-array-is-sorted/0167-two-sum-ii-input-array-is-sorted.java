class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // 1-based indexing return karni hai
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // Sum badhane ke liye left ko aage badhao
            } else {
                right--; // Sum ghatane ke liye right ko peeche lao
            }
        }
        
        // Problem guarantees exactly one solution, so this line won't execute
        return new int[]{-1, -1};
    }
}