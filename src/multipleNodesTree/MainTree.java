package multipleNodesTree;

public class MainTree {
    public static void main (String [] args) {
        CustomTree customTree = new CustomTree();
        customTree.addNode(0, 1, true);
        customTree.addNode(0, 2, false);
        customTree.addNode(0, 3, false);
        customTree.addNode(0, 4, false);
        customTree.addNode(0, 5, false);
    }
}
