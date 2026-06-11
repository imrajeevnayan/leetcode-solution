class Solution {
    public int findIndex(String s) {
        int n = s.length();
        
        // Count total closing brackets
        int totalClose = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') totalClose++;
        }
        
        int openCount = 0;
        int closeCount = 0;
        
        // Check split at position 0
        if (openCount == totalClose) return 0;
        
        for (int k = 1; k <= n; k++) {
            char prev = s.charAt(k - 1);
            if (prev == '(') openCount++;
            else closeCount++;
            
            int remainingClose = totalClose - closeCount;
            if (openCount == remainingClose) {
                return k;
            }
        }
        
        return -1;
    }
}