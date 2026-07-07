class Solution {
    boolean isDivisible(String s) {
        int remainder = 0;

        for (int i = 0; i < s.length(); i++) {

            int bit = s.charAt(i) - '0';

            remainder = (remainder * 2 + bit) % 3;
        }

        return remainder == 0;
    }
}