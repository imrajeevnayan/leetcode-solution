class Solution {
    public int minCapability(int[] nums, int k) {
        // Binary Search ki range define karo
        int low = 1;
        int high = (int) 1e9; // Constraints ke hisaab se max value
        
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check karo: Kya 'mid' capability ke saath hum k houses chun sakte hain?
            if (canRobKHouses(nums, k, mid)) {
                ans = mid;      // Ye possible hai, ab aur chota answer dhundo
                high = mid - 1;
            } else {
                low = mid + 1;  // Nahi ho pa raha, capability badhao
            }
        }
        
        return ans;
    }

    // Greedy function: Check karta hai ki maxCap ke saath k houses possible hain ya nahi
    private boolean canRobKHouses(int[] nums, int k, int maxCap) {
        int count = 0;
        int i = 0;
        int n = nums.length;
        
        while (i < n) {
            // Agar current house ki value capability ke andar hai
            if (nums[i] <= maxCap) {
                count++;        // House chun lo
                i += 2;         // Next adjacent house skip karo (i+1 skip, i+2 pe jao)
            } else {
                i++;            // Ye house nahi chun sakte, next dekho
            }
            
            // Agar k houses mil gaye, toh true return karo
            if (count >= k) {
                return true;
            }
        }
        
        return false;
    }
}