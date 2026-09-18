class Solution {
    public int catchThieves(char[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;  // i → police, j → thief
        int count = 0;

        while (i < n && j < n) {
            // Police dhoondho
            while (i < n && arr[i] != 'P') {
                i++;
            }

            // Thief dhoondho
            while (j < n && arr[j] != 'T') {
                j++;
            }

            // Agar dono mil gaye
            if (i < n && j < n) {
                // Distance check karo
                if (Math.abs(i - j) <= k) {
                    count++;   // pakad liya
                    i++;
                    j++;
                } 
                else if (j < i) {
                    // Thief bohot peeche hai → usko chhod do
                    j++;
                } 
                else {
                    // Police bohot peeche hai → usko chhod do
                    i++;
                }
            }
        }

        return count;
    }
}