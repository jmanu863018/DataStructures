public class Main {
    public static void main (String [] args) {
        CustomList newList = new CustomList();
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
    }
}
