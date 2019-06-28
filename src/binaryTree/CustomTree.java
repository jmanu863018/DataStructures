package binaryTree;

public class CustomTree {
    protected Node root;
    protected int height;

    /**
     * Adds a node to tree.
     * @param value value of new node.
     */
    public void add(int value) {
        Node newNode = new Node(value);
        addNode(newNode, root);
    }

    /**
     * Adds node to tree.
     * @param newNode new node to add into tree.
     * @param customRoot custom root to add node (left or right) branch.
     */
    private void addNode(Node newNode, Node customRoot) {
        if (customRoot == null) {
            root = newNode;
        } else if (newNode.value <= customRoot.value) {
            if (customRoot.left == null) {
                customRoot.left = newNode;
            } else {
                addNode(newNode, customRoot.left);
            }
        } else {
            if (customRoot.right == null) {
                customRoot.right = newNode;
            } else {
                addNode(newNode, customRoot.right);
            }
        }
    }

    /**
     * Prints Tree.
     * @param customRoot actual node.
     */
    public void printTree(Node customRoot) {
        if (customRoot != null) {
            System.out.print(customRoot.value + " ");
            printTree(customRoot.left);
            printTree(customRoot.right);
        }
    }

    public void balanceTree(Node customRoot) {
        if (customRoot != null) {
            balanceTree(customRoot.balance().left);
            balanceTree(customRoot.balance().right);
        }
    }
}
