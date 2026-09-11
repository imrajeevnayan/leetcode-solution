class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Frequency of every digit
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        // Hundreds place: 1-9
        for (int a = 1; a <= 9; a++) {

            if (freq[a] == 0) {
                continue;
            }

            freq[a]--;

            // Tens place: 0-9
            for (int b = 0; b <= 9; b++) {

                if (freq[b] == 0) {
                    continue;
                }

                freq[b]--;

                // Units place: even digits only
                for (int c = 0; c <= 8; c += 2) {

                    if (freq[c] > 0) {
                        count++;
                    }
                }

                freq[b]++;
            }

            freq[a]++;
        }

        return count;
    }
}
