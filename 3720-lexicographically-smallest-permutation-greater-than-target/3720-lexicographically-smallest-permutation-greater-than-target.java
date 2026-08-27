class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] cnt = new int[26];

        for (char c : s.toCharArray())
            cnt[c - 'a']++;

        char[] ans = new char[target.length()];
        int i = 0;

        while (i < target.length()) {
            int x = target.charAt(i) - 'a';

            if (cnt[x] > 0) {
                ans[i] = target.charAt(i);
                cnt[x]--;
                i++;
            } else {
                break;
            }
        }

        if (i < target.length()) {
            int x = target.charAt(i) - 'a';

            for (int c = x + 1; c < 26; c++) {
                if (cnt[c] > 0) {
                    ans[i] = (char) ('a' + c);
                    cnt[c]--;

                    int k = i + 1;
                    for (int j = 0; j < 26; j++) {
                        while (cnt[j]-- > 0)
                            ans[k++] = (char) ('a' + j);
                    }

                    return new String(ans);
                }
            }
        }

        while (i > 0) {
            i--;
            cnt[ans[i] - 'a']++;

            int x = ans[i] - 'a';

            for (int c = x + 1; c < 26; c++) {
                if (cnt[c] > 0) {
                    ans[i] = (char) ('a' + c);
                    cnt[c]--;

                    int k = i + 1;
                    for (int j = 0; j < 26; j++) {
                        while (cnt[j] > 0) {
                            ans[k++] = (char) ('a' + j);
                            cnt[j]--;
                        }
                    }

                    return new String(ans);
                }
            }
        }

        return "";
    }
}
