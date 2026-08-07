import java.util.HashMap;
import java.util.Map;

class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // Remove node from list
    private void remove(Node node) {

        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // Insert node after head
    private void insert(Node node) {

        Node nextNode = head.next;

        head.next = node;
        node.prev = head;

        node.next = nextNode;
        nextNode.prev = node;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // move to front
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        // key already exists
        if (map.containsKey(key)) {

            Node oldNode = map.get(key);

            remove(oldNode);
        }

        Node newNode = new Node(key, value);

        insert(newNode);

        map.put(key, newNode);

        // remove LRU
        if (map.size() > capacity) {

            Node lru = tail.prev;

            remove(lru);

            map.remove(lru.key);
        }
    }
}