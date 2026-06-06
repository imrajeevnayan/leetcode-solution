class Solution {
    public void deleteMid(Stack<Integer> s) {
        solve(s, 0, s.size());
    }

    private void solve(Stack<Integer> s, int curr, int size) {
        if (curr == size / 2) {
            s.pop();
            return;
        }
        int temp = s.pop();
        solve(s, curr + 1, size);
        s.push(temp);
    }
}