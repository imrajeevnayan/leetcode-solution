class Solution {
    public boolean isBalanced(String num) {
        int balance = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            if (i % 2 == 0) {
                balance += digit;
            } else {
                balance -= digit;
            }
        }

        return balance == 0;
    }
}
