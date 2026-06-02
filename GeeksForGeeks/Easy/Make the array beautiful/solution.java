class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!st.isEmpty() &&
                ((st.peek() < 0 && arr[i] >= 0) || (st.peek() >= 0 && arr[i] < 0)))  st.pop();
         else  st.push(arr[i]);
        }
        return new ArrayList<>(st);
    }
}