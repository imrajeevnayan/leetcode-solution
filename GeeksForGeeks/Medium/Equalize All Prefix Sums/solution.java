class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        long curr = 0;
        for (int i = 1; i < n; i++) {
            curr += arr[i] - arr[i / 2];
            ans.add((int) curr);
        }
        return ans;
    }
}