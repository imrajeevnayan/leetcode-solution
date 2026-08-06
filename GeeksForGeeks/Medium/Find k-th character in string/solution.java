class Solution {
    char kthCharacter(int m, int n, int k) {
        String s = Integer.toBinaryString(m);

        while (n-- > 0) {
            StringBuilder sb = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (ch == '0')
                    sb.append("01");
                else
                    sb.append("10");
            }

            s = sb.toString();
        }

        return s.charAt(k - 1);
    }
}
