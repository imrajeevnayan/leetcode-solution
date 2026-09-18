class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Duplicate skip karo (same number dobara mat lo)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Agar current number positive ho gaya to aage kuch nahi milega
            if (nums[i] > 0) break;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Triplet mil gaya
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Left ke duplicates skip karo
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                    // Right ke duplicates skip karo
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;   // sum chhota hai, left badhao
                } 
                else {
                    right--;  // sum bada hai, right ghatavo
                }
            }
        }
        
        return result;
    }
}