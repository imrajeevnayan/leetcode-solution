class Solution {
    public int minOperations(int[] nums, int x) {
        
        // Step 1: Array ka total sum calculate karo
        int total = 0;
        for (int num : nums) total += num;
        
        // Step 2: Target nikalo - yeh wo sum hai jo array ke BECH mein bacha rehna chahiye
        // Kyunki hum ends se remove kar rahe hain, toh beech ka part continuous subarray hoga
        int target = total - x;
        
        // Edge Case 1: Agar target negative hai, iska matlab total sum hi x se kam hai
        // Toh kabhi bhi x ko 0 nahi bana payenge
        if (target < 0) return -1;
        
        // Edge Case 2: Agar target 0 hai, iska matlab poora array remove karna padega
        // Toh operations = array ki length
        if (target == 0) return nums.length;
        
        // Step 3: Sliding Window technique use karenge
        // Humein MAXIMUM length ka subarray dhundna hai jiska sum = target ho
        // Kyunki jitna lamba subarray bachega, utne hi kam elements remove honge (minimum operations)
        
        int maxLen = -1;      // Maximum length store karne ke liye (-1 means abhi tak nahi mila)
        int left = 0;         // Window ka left pointer
        int currentSum = 0;   // Current window ka sum
        
        // Right pointer se window expand karte jaao
        for (int right = 0; right < nums.length; right++) {
            
            // Current element ko window mein add karo
            currentSum += nums[right];
            
            // Agar current sum target se zyada ho gaya, toh left se shrink karo
            // Jab tak sum target se bada hai ya equal nahi hota
            while (currentSum > target && left <= right) {
                currentSum -= nums[left];  // Left wala element hatao
                left++;                    // Left pointer aage badhao
            }
            
            // Agar exact match mil gaya (currentSum == target)
            if (currentSum == target) {
                // Current window ki length calculate karo aur maxLen update karo
                // Window length = right - left + 1
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        
        // Step 4: Result calculate karo
        // Agar maxLen -1 hai, iska matlab aisa koi subarray nahi mila
        // Otherwise, operations = total elements - bacha hua subarray length
        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}