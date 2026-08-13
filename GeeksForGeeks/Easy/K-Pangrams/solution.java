class Solution {
    boolean kPangram(String str, int k) {
        Set<Character> set = new HashSet<>();

        int spaces = 0;

        for (char c : str.toCharArray()) {
            if (c == ' ')  spaces++;
            else  set.add(c);
        } 
        return str.length() - spaces >= 26 &&
               set.size() + k >= 26;
    }
}