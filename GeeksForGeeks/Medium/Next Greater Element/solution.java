class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int index = st.pop();
                result.set(index, arr[i]); 
            }
            st.push(i);
        }
        return result;
    }
}