class Solution {
    public static String oddEven(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            int position = i + 1;

            if (position % 2 == freq[i] % 2) {
                count++;
            }
        }

        return count % 2 == 1 ? "ODD" : "EVEN";
    }
}