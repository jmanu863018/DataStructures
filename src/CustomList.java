public class CustomList<T> implements IList<T> {
    private Node head;
    private Node tail;

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

    @Override
    public void removeFirst() {
        if (head.next == null) {
            head = null;
        }
        head = head.next;
    }

    @Override
    public void removeLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    @Override
    public void removeFromPosition(int position) {
        Node current = head;
        for (int initialPosition = 1; initialPosition < position - 1 ; initialPosition++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

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
}
