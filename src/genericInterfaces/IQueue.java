package genericInterfaces;

public interface IQueue<T> {

    void add(T value);
    void remove();
    T peek();
}
