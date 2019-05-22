package customStructures;

/**
 * Class for nodes.
 */
public class Node<T> {
    protected T value;
    protected Node next;

    /**
     * Initializes a new node object.
     * @param value
     */
    public Node(T value) {
        this.value = value;
        next = null;
    }
}
