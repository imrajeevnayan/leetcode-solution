class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    // Same index ko dobara use nahi kar sakte
                    if (i == j || j == k || i == k)  continue;
                
                    // 3-digit number cannot start with 0
                    if (digits[i] == 0) continue;
                    
                    // Even number ka last digit even hona chahiye
                    if (digits[k] % 2 != 0) continue;
                    
                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    set.add(num);
                }
            }
        }

        return set.size();
    }
}
