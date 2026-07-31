class Solution {
    static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(arr, new boolean[arr.length], new ArrayList<>(), ans);
        return ans;
    }
    static void solve(int[] arr, boolean[] vis, ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> ans) {
        if (cur.size() == arr.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (vis[i] || (i > 0 && arr[i] == arr[i - 1] && !vis[i - 1])) continue;
            vis[i] = true;
            cur.add(arr[i]);
            solve(arr, vis, cur, ans);
            cur.remove(cur.size() - 1);
            vis[i] = false;
        }
    }
}