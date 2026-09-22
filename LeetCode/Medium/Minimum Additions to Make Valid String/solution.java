class Solution {
    public int addMinimum(String word) {

        int count = 0;
        int i = 0;

        while (i < word.length()) {

            // a hona chahiye
            if (word.charAt(i) == 'a') {
                i++;
            } else {
                count++;
            }

            // b hona chahiye
            if (i < word.length() && word.charAt(i) == 'b') {
                i++;
            } else {
                count++;
            }

            // c hona chahiye
            if (i < word.length() && word.charAt(i) == 'c') {
                i++;
            } else {
                count++;
            }
        }

        return count;
    }
}
