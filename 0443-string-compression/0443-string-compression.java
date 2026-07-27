class Solution {
    public int compress(char[] chars) {
        int count = 1,idx = 0;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) count++;
           else {
                chars[idx++] = chars[i - 1];
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[idx++] = c;
                    }
                }
                count = 1;
            }
        }
        return idx;
    }
}