package msqueue;

public class MSQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public MSQueue() {
        Node<T> dummy = new Node<T>(null);
        this.head = dummy;
        this.tail = dummy;
    }

    @Override
    public void enqueue(T x) {
        Node<T> newTail = new Node<T>(x);
        tail.next = newTail;
        tail = newTail;
    }

    @Override
    public T dequeue() {
        Node<T> curHead = head;
        Node<T> next = head.next;
        if (curHead == tail)
            return null;
        head = next;
        return next.x;
    }

    @Override
    public T peek() {
        Node<T> curHead = head;
        Node<T> next = head.next;
        if (curHead == tail)
            return null;
        return next.x;
    }

    private static class Node<T> {
        final T x;
        Node<T> next;

        Node(T x) {
            this.x = x;
        }
    }
}