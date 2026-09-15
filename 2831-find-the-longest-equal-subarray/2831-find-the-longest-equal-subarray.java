class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxFreq = 0;

        for (int right = 0; right < nums.size(); right++) {
            int curr= nums.get(right);
            
            // Map mein current number ki frequency badhao
            // getOrDefault: Agar number pehle se hai toh uski value lo, nahi toh 0 lo
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            
            // MaxFreq update karo: Kya abhi wala number sabse zyada frequent ho gaya?
            maxFreq = Math.max(maxFreq, map.get(curr));
            
            // 3. Check karo: Kya window valid hai?
            // Valid condition: (Window Size - MaxFreq) <= k
            // Iska matlab: Jo numbers "most frequent" nahi hain, unhe delete karne ke liye k permissions chahiye
            int windowSize = right - left + 1;
            
            if (windowSize - maxFreq > k) {
                // Agar deletions k se zyada ho rahe hain, toh window shrink karo (left badhao)
                
                int leftNum = nums.get(left);
                // Left side wale number ki frequency map mein kam karo
                map.put(leftNum, map.get(leftNum) - 1);
                
                // Left pointer ko aage badhao
                left++;
            }
        }
        
        // 4. Final Answer: MaxFreq hi wo longest equal subarray ki length hai
        return maxFreq;
    }
}