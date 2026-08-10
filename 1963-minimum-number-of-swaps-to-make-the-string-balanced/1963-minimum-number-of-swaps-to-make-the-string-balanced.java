class Solution {
    public int minSwaps(String s) {
        int open = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '[')  open++;
            else  open--;
            max = Math.min(max, open);
        }
        return (-max + 1) / 2;
    }
}