class Solution {
    public int[] validSequence(String a, String b) {
        int n = a.length(), m = b.length();
        int[] last = new int[m];
        Arrays.fill(last, -1);

        int i = n - 1, j = m - 1;

        // last[j] = latest position where b[j] can be matched
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == b.charAt(j))
                last[j--] = i;
            i--;
        }

        int[] ans = new int[m];
        boolean used = false;
        j = 0;

        for (i = 0; i < n && j < m; i++) {
            if (a.charAt(i) == b.charAt(j)) {
                ans[j++] = i;
            } 
            else if (!used && (j == m - 1 || i < last[j + 1])) {
                ans[j++] = i;
                used = true;
            }
        }

        return j == m ? ans : new int[0];
    }
}