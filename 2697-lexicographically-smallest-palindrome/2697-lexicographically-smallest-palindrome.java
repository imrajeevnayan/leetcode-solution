class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a = s.toCharArray();
        int l = 0,r = a.length - 1;
        while (l < r) {
            if (a[l] != a[r]) {
                if (a[l] < a[r])  a[r] = a[l];
                else  a[l] = a[r];
            }
            l++;
            r--;
        }
        return new String(a);
    }
}