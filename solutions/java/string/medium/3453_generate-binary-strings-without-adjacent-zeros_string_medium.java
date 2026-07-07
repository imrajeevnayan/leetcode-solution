class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(n, "", ans);
        return ans;
    }
    void backtrack(int n, String current, List<String> ans) {
        if (current.length() == n) {
            ans.add(current);
            return;
        }
        // Always allowed to add 1
        backtrack(n, current + "1", ans);
        // Add 0 only if previous character isn't 0
        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            backtrack(n, current + "0", ans);
        }
    }
}