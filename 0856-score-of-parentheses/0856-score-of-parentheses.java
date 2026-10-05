class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')  depth++;
             else {
                depth--;
                // Jab "()" pair close ho → 2^depth add karo
                // Ye tabhi hota hai jab pichla char '(' tha
                if (s.charAt(i - 1) == '(') {
                    score += (1 << depth); // 2^depth
                }
            }
        }
        
        return score;
    }
}