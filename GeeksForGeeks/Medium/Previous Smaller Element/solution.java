class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
       int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                ans.set(st.pop(), arr[i]);
            }
            st.push(i);
        }
        return ans;
        
    }
}