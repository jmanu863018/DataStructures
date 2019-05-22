package customStructures;

import genericInterfaces.IStack;

public class CustomStack<T> implements IStack<T> {
    private CustomList<T> customList;

    public CustomStack() {
        customList = new CustomList<>();
    }

    @Override
    public void push(T value) {
        customList.addToTheBeginning(value);
    }

    @Override
    public void pop() {
        customList.removeFirst();
    }

    @Override
    public T peek() {
        return (T) customList.getHead().value;
    }
}
