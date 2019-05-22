package customStructures;

import genericInterfaces.IQueue;

public class CustomQueue<T> implements IQueue<T> {

    private CustomList<T> customList;

    public CustomQueue() {
        customList = new CustomList<T>();
    }

    @Override
    public void add(T value) {
        customList.add(value);
    }

    @Override
    public void remove() {
        customList.removeFirst();
    }

    @Override
    public T peek() {
        return (T) customList.getHead().value;
    }
}
