class Solution {
    public int pairSum(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        int index = 0;
        while (curr != null) {
            map.put(index, curr.val);
            curr = curr.next;
            index++;
        }

        int n = index;
        int max = 0;

        for (int i = 0; i < n / 2; i++) {
            max = Math.max(max, map.get(i) + map.get(n - 1 - i));
        }

        return max;
    }
}