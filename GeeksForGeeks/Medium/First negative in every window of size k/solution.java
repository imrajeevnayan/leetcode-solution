class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Store index of negative numbers
            if (arr[i] < 0) {
                q.offer(i);
            }

            // Window of size k is formed
            if (i >= k - 1) {

                // Remove indices outside the current window
                while (!q.isEmpty() && q.peek() < i - k + 1) {
                    q.poll();
                }

                // First negative in current window
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(arr[q.peek()]);
                }
            }
        }

        return ans;
    }
}