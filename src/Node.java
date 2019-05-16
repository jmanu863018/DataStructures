public class Node<T> {
    protected T value;
    protected Node next;

    public Node(T value) {
        this.value = value;
        next = null;
    }
}
