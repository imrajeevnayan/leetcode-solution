class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target); // Negative ko positive kar lo
        
        long low = 1, high = target;
        long k = 0;

        // 1. Binary Search: Minimum 'k' dhundo jahan Sum >= Target
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum >= target) {
                k = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // 2. Parity Check
        long sum = k * (k + 1) / 2;
        long diff = sum - target;

        if (diff % 2 == 0) {
            return (int) k; // Even hai, toh perfect hai
        } 
        
        // Odd hai, toh next steps check karo
        // Rule: Agar k even hai toh +1 step, agar k odd hai toh +2 steps
        return (k % 2 == 0) ? (int)(k + 1) : (int)(k + 2);
    }
}