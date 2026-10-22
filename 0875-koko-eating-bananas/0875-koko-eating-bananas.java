class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // Find max pile size for upper bound
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canEatAll(piles, h, mid)) {
                ans = mid;       // Possible answer, try for smaller speed
                high = mid - 1;
            } else {
                low = mid + 1;   // Need faster speed
            }
        }
        
        return ans;
    }
    
    private boolean canEatAll(int[] piles, int h, int speed) {
        long hours = 0; // Use long to avoid overflow
        for (int pile : piles) {
            // Ceil division: (pile + speed - 1) / speed
            hours += (pile + speed - 1) / speed;
            
            // Early exit if already exceeded h
            if (hours > h) return false;
        }
        return true;
    }
}