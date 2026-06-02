class Solution {
    public void removeCharacter(StringBuilder s, char c) {
        int j= 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                s.setCharAt(j, s.charAt(i));
                j++;
            }
        }
         s.setLength(j);
    }
}