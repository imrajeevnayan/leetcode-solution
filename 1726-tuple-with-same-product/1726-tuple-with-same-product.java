class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productFreq = new HashMap<>();
        
        // All pair products
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productFreq.merge(product, 1, Integer::sum);
            }
        }
        
        int count = 0;
        for (int freq : productFreq.values()) {
            if (freq >= 2) {
                // C(freq, 2) pairs of pairs × 8 permutations
                count += freq * (freq - 1) / 2 * 8;
            }
        }
        
        return count;
    }
}