class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i > 0) res.append(" ");
            res.append(words[i]);
        }
        return res.toString();
    }
}
