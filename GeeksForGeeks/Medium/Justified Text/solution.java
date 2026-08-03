class Solution {
    public ArrayList<String> justifyText(String[] words, int l) {
        ArrayList<String> ans = new ArrayList<>();

        int i = 0;

        while (i < words.length) {
            int j = i;
            int len = 0;

            // Find words for this line
            while (j < words.length && len + words[j].length() + j - i <= l) {
                len += words[j].length();
                j++;
            }

            StringBuilder sb = new StringBuilder();
            int gaps = j - i - 1;

            // Last line or single word
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    if (k > i) sb.append(" ");
                    sb.append(words[k]);
                }
            } else {
                int space = (l - len) / gaps;
                int extra = (l - len) % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);

                    if (k < j - 1) {
                        sb.append(" ".repeat(space + (extra-- > 0 ? 1 : 0)));
                    }
                }
            }

            // Add trailing spaces
            while (sb.length() < l)
                sb.append(" ");

            ans.add(sb.toString());
            i = j;
        }

        return ans;
    }
}