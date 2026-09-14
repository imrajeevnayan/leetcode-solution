class Solution {
    public List<String> extractInt(String s) {
        List<String> ans = new ArrayList<>();
        String num = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))  num += c;
            else if (!num.isEmpty()) {
                ans.add(num);
                num = "";
            }
        }

        if (!num.isEmpty()) ans.add(num);

        return ans;
    }
}
