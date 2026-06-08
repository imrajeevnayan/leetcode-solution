class Solution {
    public static void rotateByK(LinkedList<Integer> ll, int k) {
        int n = ll.size();
        if (n == 0) return;

        k %= n;

        for (int i = 0; i < k; i++) {
            ll.addFirst(ll.removeLast());
        }
    }
}