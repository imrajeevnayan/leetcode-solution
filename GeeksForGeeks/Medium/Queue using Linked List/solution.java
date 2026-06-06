// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node front, rear;
    int count;

    public myQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    public void dequeue() {
        if (isEmpty()) return;
        front = front.next;
        if (front == null) rear = null; // If queue becomes empty
        count--;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return front.data;
    }

    public int size() {
        return count;
    }
}