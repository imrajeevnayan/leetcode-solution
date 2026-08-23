class Solution {
    public boolean hasSameDigits(String s) {
        char[] a = s.toCharArray();

        while (a.length > 2) {
            char[] next = new char[a.length - 1];

            for (int i = 0; i < next.length; i++) {
                int x = a[i] - '0';
                int y = a[i + 1] - '0';
                next[i] = (char) ('0' + (x + y) % 10);
            }

            a = next;
        }

        return a[0] == a[1];
    }
}
