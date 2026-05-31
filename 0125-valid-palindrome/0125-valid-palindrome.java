class Solution {
    public boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int start, int end) {
        if (start >= end) return true;
        char left = s.charAt(start);
        char right = s.charAt(end);
        if (!Character.isLetterOrDigit(left)) {
            return check(s, start + 1, end);
        }

        if (!Character.isLetterOrDigit(right)) {
            return check(s, start, end - 1);
        }

        if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}