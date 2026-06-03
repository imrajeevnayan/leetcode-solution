class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));

        Stack<Integer> st = new Stack<>(); // stores elements

        for (int i = 2 * n - 1; i >= 0; i--) {

            int idx = i % n;

            while (!st.isEmpty() && st.peek() <= arr[idx]) {
                st.pop();
            }

            if (i < n) {
                res.set(idx, st.isEmpty() ? -1 : st.peek());
            }

            st.push(arr[idx]);
        }

        return res;
    }
}