package genericInterfaces;

public interface IStack<T> {
    void push(T value);
    void pop();
    T peek();
}
