class Solution {
    public int minimumLength(String s) {
        if (s == null || s.isEmpty()) return 0;
        int left = 0, right = s.length() - 1;
        
        // Jab tak pointers cross na ho jayein aur ends match karein
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char currChar = s.charAt(left);
            
            // Left pointer ko tab tak badhao jab tak same character mile
            while (left <= right && s.charAt(left) == currChar) {
                left++;
            }
            
            // Right pointer ko tab tak ghatao jab tak same character mile
            while (left <= right && s.charAt(right) == currChar) {
                right--;
            }
        }
        
        // Remaining length return karo
        // Agar left > right ho gaya toh string poori delete ho gayi (length 0)
        return Math.max(0, right - left + 1);
    }
}