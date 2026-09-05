
class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        Node temp = head;
        Node last = null;

        // Forward traversal
        while (temp != null) {
            forward.add(temp.data);
            last = temp;
            temp = temp.next;
        }

        // Backward traversal
        temp = last;
        while (temp != null) {
            backward.add(temp.data);
            temp = temp.prev;
        }

        result.add(forward);
        result.add(backward);

        return result;
    }
}
