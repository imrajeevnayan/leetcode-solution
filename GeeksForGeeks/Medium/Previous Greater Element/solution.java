class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans.set(i, arr[st.peek()]);
            }
            st.push(i);
        }

        return ans;
    }
}