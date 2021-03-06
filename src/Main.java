import binaryTree.CustomTree;
import customStructures.CustomList;
import genericInterfaces.IList;
import genericInterfaces.IQueue;

public class Main {
    public static void main (String [] args) {
        IList<Integer> newList = new CustomList<Integer>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.addToTheBeginning(8);
        newList.addToPosition(-1,1);
        newList.printList();
        System.out.println("Remove first:");
        newList.removeFirst();
        newList.printList();
        System.out.println("Remove last:");
        newList.removeLast();
        newList.printList();
        System.out.println("Remove from position:");
        newList.removeFromPosition(3);
        newList.printList();

        IList<Object> newListGeneric = new CustomList<Object>();
        newListGeneric.add('X');
        newListGeneric.add(2);
        newListGeneric.add(3.5);
        newListGeneric.add(4);
        newListGeneric.addToTheBeginning("a");
        newListGeneric.addToPosition("5",1);
        newListGeneric.printList();
        System.out.println("Remove first:");
        newListGeneric.removeFirst();
        newListGeneric.printList();
        System.out.println("Remove last:");
        newListGeneric.removeLast();
        newListGeneric.printList();
        System.out.println("Remove from position:");
        newListGeneric.removeFromPosition(0);
        newListGeneric.printList();
    }
}
