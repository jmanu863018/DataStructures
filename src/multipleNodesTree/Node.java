package multipleNodesTree;

public class Node {
    protected int value;
    protected Node[] childs;

    public Node(int value) {
        this.value = value;
        childs = new Node[0];
    }
}
