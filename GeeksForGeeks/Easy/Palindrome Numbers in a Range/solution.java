class Solution {
     private boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return original == rev;
    }
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (isPalindrome(i)) ans.add(i);
        }
        return ans;
    }
}