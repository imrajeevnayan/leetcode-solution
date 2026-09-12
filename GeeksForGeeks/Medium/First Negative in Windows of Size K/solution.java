class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            // Negative element ka index store karo
            if (arr[right] < 0) q.add(right);

            // Window size == k
            if (right - left + 1 == k) {

                // Window ke bahar wale negative indices remove karo
                while (!q.isEmpty() && q.peek() < left) q.poll();
                
                // First negative
                if (!q.isEmpty())  ans.add(arr[q.peek()]);
                else  ans.add(0);
                left++;
            }
        }

        return ans;
    }
}