package multipleNodesTree;

public class CustomTree {
    Node root;

    public void addNode(int parentValue, int nodeValue, boolean isRoot) {
        Node node = new Node(nodeValue);
        if(isRoot) {
            root = node;
        } else {
            if(root.childs.length > 0) {
                if (verifyChildExists(root, node)){
                    System.out.println(String.format("Value %d already exists in Map for parent %d", parentValue, nodeValue));
                } else {
                    addChild(root, node);
                }
            }
        }
    }

    public void addChild(Node parentNode, Node childNode) {
        Node[] aux = parentNode.childs.clone();
        parentNode.childs = new Node[parentNode.childs.length + 1];
        for(int i = 0; i < aux.length; i++) {
            parentNode.childs[i] = aux[i];
        }
        parentNode.childs[parentNode.childs.length] = childNode;
    }

    public boolean verifyChildExists(Node parent, Node child){
        for(Node childs:parent.childs) {
            if(childs.value == child.value){
                return true;
            }
        }
        return false;
    }
}
