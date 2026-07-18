class Solution {
    static void solve(String s, int index, String output, ArrayList<String> ans) {
        if (index == s.length()) {
            ans.add(output);
            return;
        }
        char ch = s.charAt(index);
        solve(s, index + 1, output + ch, ans);
        solve(s, index + 1, output, ans);
    }
    public List<String> powerSet(String s) {
        ArrayList<String> ans = new ArrayList<>();
        solve(s, 0, "", ans);
        Collections.sort(ans);
        return ans;
    }
}