class Solution {
    public boolean areKAnagrams(String s1, String s2, int k) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for (char ch : s1.toCharArray()) freq[ch - 'a']++;
        for (char ch : s2.toCharArray()) freq[ch - 'a']--;
        int count = 0;
        for (int x : freq) {
            if (x > 0)
                count += x;
        }
        return count <= k;
    }
}
