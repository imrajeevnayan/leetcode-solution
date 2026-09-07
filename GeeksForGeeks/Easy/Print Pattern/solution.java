class Solution {
    public ArrayList<Integer> pattern(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(n, n, ans);
        return ans;
    }

    void solve(int current, int original, ArrayList<Integer> ans) {
        
        // Pehle current number add karo
        ans.add(current);

        // Agar current <= 0 hai, ab wapas jaana hai
        if (current <= 0)  return;
        
        // 5 decrease
        solve(current - 5, original, ans);

        // Recursion se return hone ke baad 5 increase
        ans.add(current);
    }
}
