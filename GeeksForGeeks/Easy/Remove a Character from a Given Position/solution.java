class Solution {
    public String removeCharacter(String s, int pos) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == pos) continue;
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}