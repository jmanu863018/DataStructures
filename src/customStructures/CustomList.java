package customStructures;

import genericInterfaces.IList;

/**
 * Class to handle custom list.
 */
public class CustomList<T> implements IList<T> {

    private Node head;
    private Node tail;

    /**
     * Adds a value into custom list.
     * @param value
     */
    @Override
    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Add a value to the beginning of list.
     * @param value
     */
    @Override
    public void addToTheBeginning(T value) {
        if (head != null) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        } else {
            add(value);
        }
    }

    /**
     * Adds a value to specific position.
     * @param value
     * @param position
     */
    @Override
    public void addToPosition(T value, int position) {
        if (head != null) {
            Node current = head;
            for (int initialPosition = 1; initialPosition < position - 1 ; initialPosition++) {
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            add(value);
        }
    }

    /**
     * Removes a value from first position.
     */
    @Override
    public void removeFirst() {
        if (head.next == null) {
            head = null;
        }
        head = head.next;
    }

    /**
     * Removes a value from last position.
     */
    @Override
    public void removeLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    /**
     * Removes a value from an specific position.
     * @param position
     */
    @Override
    public void removeFromPosition(int position) {
        Node current = head;
        for (int initialPosition = 1; initialPosition < position - 1 ; initialPosition++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    /**
     * Prints list.
     */
    @Override
    public void printList() {
        Node current = head;
        if (head != null) {
            while(current != null) {
                System.out.println("Value: " + current.value);
                current = current.next;
            }
        }
    }

    public Node getHead() {
        return head;
    }
}
