class Solution {
    static int areAnagram(String S1, String S2) {

        if (S1.length() != S2.length())return 0;
        int[] freq = new int[26];
        for (int i = 0; i < S1.length(); i++) {
            freq[S1.charAt(i) - 'a']++;
            freq[S2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) return 0;
        }
        return 1;
    }
}