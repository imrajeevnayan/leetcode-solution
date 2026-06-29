class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Window formed
            if (i >= k - 1) {
                ans.add(arr[dq.peekFirst()]);
            }
        }

        return ans;
    }
}