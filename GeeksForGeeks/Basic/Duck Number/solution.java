class Solution {
    static boolean check_duck(String num) {

        boolean foundNonZero = false;

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            if (ch != '0') {
                foundNonZero = true;
            }

            else if (foundNonZero) {
                return true;
            }
        }

        return false;
    }
}