class Solution {
    public int[] getSmaller(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        Arrays.fill(left, -1);
        Arrays.fill(right, -1);

        Stack<Integer> st = new Stack<>();

        // Smaller on left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            if (!st.isEmpty())
                left[i] = st.peek();

            st.push(i);
        }

        st.clear();

        // Smaller on right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            if (!st.isEmpty())
                right[i] = st.peek();

            st.push(i);
        }

        // Choose nearest
        for (int i = 0; i < n; i++) {
            if (left[i] == -1)
                ans[i] = right[i];
            else if (right[i] == -1)
                ans[i] = left[i];
            else {
                int dl = i - left[i];
                int dr = right[i] - i;

                if (dl < dr)
                    ans[i] = left[i];
                else if (dr < dl)
                    ans[i] = right[i];
                else if (arr[left[i]] <= arr[right[i]])
                    ans[i] = left[i];
                else
                    ans[i] = right[i];
            }
        }

        return ans;
    }
}
