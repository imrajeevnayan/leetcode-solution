class Solution {
    public static int countWords(String s) {
        if (s == null || s.trim().length() == 0)  return 0;
        String[] words = s.trim().split("\\s+");
        return words.length;
        
    }
}