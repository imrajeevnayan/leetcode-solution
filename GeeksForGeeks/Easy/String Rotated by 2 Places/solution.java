class Solution {
    public static boolean isRotated(String s1, String s2) {
        int n = s1.length();
        if (n != s2.length()) return false;
        if (n == 0) return true;
        
        boolean leftRot = true;  // Check for left rotation by 2
        boolean rightRot = true; // Check for right rotation by 2
        
        for (int i = 0; i < n; i++) {
            // Left Rotation: s1[i] should match s2[(i - 2 + n) % n]
            if (s1.charAt(i) != s2.charAt((i - 2 + n) % n)) {
                leftRot = false;
            }
            
            // Right Rotation: s1[i] should match s2[(i + 2) % n]
            if (s1.charAt(i) != s2.charAt((i + 2) % n)) {
                rightRot = false;
            }
            
            // If both are false, no need to check further
            if (!leftRot && !rightRot) return false;
        }
        
        return leftRot || rightRot;
    }
}