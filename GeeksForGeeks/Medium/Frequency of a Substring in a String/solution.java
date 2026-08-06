class Solution {
    public int countFreq(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[] lps = new int[m];
        buildLPS(s2, lps);

        int i = 0, j = 0;
        int count = 0;

        while (i < n) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    count++;
                    j = lps[j - 1]; // for overlapping matches
                }
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return count;
    }

    private void buildLPS(String pat, int[] lps) {
        int len = 0;
        int i = 1;

        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else
                    lps[i++] = 0;
            }
        }
    }
}
