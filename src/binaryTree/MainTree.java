package binaryTree;

public class MainTree {
    public static void main (String [] args) {
        CustomTree customTree = new CustomTree();
        customTree.add(1);
        customTree.add(3);
        customTree.add(5);
        customTree.add(2);
        customTree.add(8);
        customTree.add(0);
        customTree.printTree(customTree.root);
    }
}
