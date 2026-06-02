class Solution {
    public String removePair(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        
        String result = sb.toString();
        
        if (result.isEmpty()) {
            return "-1";
        }
        
        return result;
    }
}