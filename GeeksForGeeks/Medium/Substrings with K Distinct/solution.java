class Solution {
    public int countSubstr(String s, int k) {
        return atMost(s, k) - atMost(s, k - 1);
    }

    private int atMost(String s, int k) {
        if (k < 0) return 0;

        int[] freq = new int[26];
        int left = 0, distinct = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            int r = s.charAt(right) - 'a';
            if (freq[r] == 0) distinct++;
            freq[r]++;

            // Agar distinct > k ho jaye toh shrink karo
            while (distinct > k) {
                int l = s.charAt(left) - 'a';
                freq[l]--;
                if (freq[l] == 0) distinct--;
                left++;
            }

            // Ab window mein at most k distinct hain
            // Is right ending ke saare valid substrings = (right - left + 1)
            count += (right - left + 1);
        }

        return count;
    }
}