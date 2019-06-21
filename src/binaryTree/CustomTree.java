package binaryTree;

public class CustomTree {
    protected Node root;

    public void add(int value) {
        Node newNode = new Node(value);
        addNode(newNode, root);
    }

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

    public void printTree(Node customRoot) {
        if (customRoot != null) {
            System.out.print("Node: " + customRoot.value);
            printTree(customRoot.left);
            printTree(customRoot.right);
        }
    }
}
