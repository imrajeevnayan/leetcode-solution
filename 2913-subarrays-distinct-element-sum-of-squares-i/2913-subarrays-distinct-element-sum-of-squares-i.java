class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        long totalSum = 0; // Long use kiya overflow se bachne ke liye
        
        // Har starting index i ke liye
        for (int i = 0; i < n; i++) {
            Set<Integer> distinctSet = new HashSet<>();
            
            // Ending index j ko aage badhao
            for (int j = i; j < n; j++) {
                distinctSet.add(nums.get(j));
                
                // Current subarray [i...j] mein distinct elements ki count
                int k = distinctSet.size();
                
                // Square add karo
                totalSum += (long) k * k;
            }
        }
        
        return (int) totalSum;
    }
}