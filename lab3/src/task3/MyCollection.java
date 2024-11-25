package task3;

public interface MyCollection<E> {
    boolean add(E element);

    boolean remove(E element);

    boolean contains(E element);

    int size();

    void clear();

    boolean isEmpty();

    MyIterator<E> iterator();

    interface MyIterator<E> {
        boolean hasNext();
        E next();
    }
    void printAll();


}
