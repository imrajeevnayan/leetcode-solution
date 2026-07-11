class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";
        
        int[] target = new int[128];
        for (char c : t.toCharArray()) target[c]++;
        

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int matchCount = 0; 
        int[] windowMap = new int[128];
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            windowMap[rightChar]++;

            // If this character is needed and we haven't over-collected it yet
            if (target[rightChar] > 0 && windowMap[rightChar] <= target[rightChar])matchCount++;
            
            while (matchCount == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                if (target[leftChar] > 0 && windowMap[leftChar] <= target[leftChar]) {
                    matchCount--;
                }
               windowMap[leftChar]--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}