class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sent : sentences) {
            int words = 1;
            for (char ch : sent.toCharArray()) {
                if (ch == ' ') {
                    words++;
                }
            }
            maxWords = Math.max(maxWords, words);
        }
        return maxWords;
    }
}