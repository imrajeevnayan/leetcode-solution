class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (w.length() <= 2) sb.append(w);
            else {
                sb.append(Character.toUpperCase(w.charAt(0))) .append(w.substring(1));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
