class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] f = new int[26];

        for (char c : s.toCharArray())
            f[c - 'a']++;

        String ans = "";
        int max = 0, bestFreq = 0;

        for (int freq = 1; freq <= s.length(); freq++) {
            String t = "";

            for (int i = 0; i < 26; i++)
                if (f[i] == freq)
                    t += (char)('a' + i);

            if (t.length() > max || 
                (t.length() == max && freq > bestFreq)) {
                max = t.length();
                bestFreq = freq;
                ans = t;
            }
        }

        return ans;
    }
}
