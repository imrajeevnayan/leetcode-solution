class Solution {
    String firstAlphabet(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(word.charAt(0));
            }
        }

        return result.toString();
    }
}