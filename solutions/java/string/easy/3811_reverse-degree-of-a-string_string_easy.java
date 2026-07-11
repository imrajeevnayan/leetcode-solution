class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int reversePosition = 'z' - s.charAt(i) + 1;
            int index = i + 1;

            sum += reversePosition * index;
        }

        return sum;
    }
}