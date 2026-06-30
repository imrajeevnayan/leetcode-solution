class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                long remaining = (long) target - nums[i] - nums[j];
                int left = j + 1, right = n - 1;
                
                while (left < right) {
                    long sum = (long) nums[left] + nums[right];
                    
                    if (sum == remaining) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < remaining) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}