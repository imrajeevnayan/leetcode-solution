class Solution {
    public static int vowelCount(String s) {
        int[] freq = new int[5];
        String vowels = "aeiou";
        int count = 0, ans = 1;

        for (char c : s.toCharArray()) {
            int i = vowels.indexOf(c);
            if (i != -1)
                freq[i]++;
        }

        for (int f : freq) {
            if (f > 0) {
                ans *= f;
                count++;
            }
        }

        if (count == 0)
            return 0;

        for (int i = 1; i <= count; i++)
            ans *= i;

        return ans;
    }
}
