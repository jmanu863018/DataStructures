/**
 * Class for nodes.
 */
public class Node {
    protected int value;
    protected Node next;

    /**
     * Initializes a new node object.
     * @param value
     */
    public Node(int value) {
        this.value = value;
        next = null;
    }
}
