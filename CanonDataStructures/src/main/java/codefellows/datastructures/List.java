package codefellows.datastructures;

public interface List<E> {
    int size();
    boolean isEmpty();
    void append(E value);
    void insert(int index, E value);
    E get(int index);
    void set(int index, E value);
    boolean removeValue(E value);
    E removeAtIndex(int index);
    int indexOf(E value);
    boolean contains(E value);
    String toString();
}
