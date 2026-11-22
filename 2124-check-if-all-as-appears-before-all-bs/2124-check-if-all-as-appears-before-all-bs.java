class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;

        for (char ch : s.toCharArray()) {
            if (ch == 'b')  foundB = true;
            else if (foundB) { // found 'a' after a 'b'
                return false;
            }
        }

        return true;
    }
}