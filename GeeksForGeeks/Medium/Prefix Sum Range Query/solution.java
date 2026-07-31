class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) pre[i + 1] = pre[i] + arr[i];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int[] q : queries)
        ans.add(pre[q[1] + 1] - pre[q[0]]);
            
        return ans;
    }
}