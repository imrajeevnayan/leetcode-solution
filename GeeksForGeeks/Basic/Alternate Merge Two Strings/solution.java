class Solution {
    String merge(String s1, String s2) {
        String s = "";
        int i = 0;

        while (i < s1.length() || i < s2.length()) {
            if (i < s1.length())  s += s1.charAt(i);
            if (i < s2.length())  s += s2.charAt(i);
            i++;
        }
        return s;
    }
}