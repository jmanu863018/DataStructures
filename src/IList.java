public interface IList<T> {
    void add(T value);
    void removeFirst();
    void printList();
    void addToTheBeginning(T value);
    void addToPosition(T value, int position);
    void removeLast();
    void removeFromPosition(int position);
}
