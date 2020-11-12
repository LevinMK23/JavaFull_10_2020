package lesson1.interfaces;

public interface Writable<T> {
    void write(T value) throws Exception;
}
