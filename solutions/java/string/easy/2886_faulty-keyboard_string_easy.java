class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        boolean reversed = false;

        for (char ch : s.toCharArray()) {
            if (ch == 'i') {
                reversed = !reversed; // toggle direction
            } else {
                if (!reversed) {
                    sb.append(ch);
                } else {
                    sb.insert(0, ch); // simulate reversed insertion
                }
            }
        }

        if (reversed) {
            sb.reverse();
        }

        return sb.toString();
    }
}