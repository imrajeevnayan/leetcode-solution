class Solution {
    public int countTriplets(Node head, int x) {
        ArrayList<Integer> arr = new ArrayList<>();

        Node curr = head;
        while (curr != null) {
            arr.add(curr.data);
            curr = curr.next;
        }

        int n = arr.size();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr.get(i) + arr.get(left) + arr.get(right);

                if (sum == x) {
                    count++;
                    left++;
                    right--;
                } 
                else if (sum > x) {
                    // Descending order:
                    // move left forward to get a smaller value
                    left++;
                } 
                else {
                    // Need a larger value, so move right backward
                    right--;
                }
            }
        }

        return count;
    }
}