class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        long count = 0; // use long to avoid overflow!
        int MOD = 1_000_000_007;
        
        for (int num : nums) {
            int transformed = num - reverse(num);
            
            // Pehle count karo kitne same value pehle aaye
            count += freq.getOrDefault(transformed, 0);
            count %= MOD;
            
            // Phir frequency update karo
            freq.merge(transformed, 1, Integer::sum);
        }
        
        return (int) count;
    }
    
    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}