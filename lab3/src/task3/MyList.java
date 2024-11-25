package task3;

import java.util.ArrayList;
import java.util.TreeSet;

public class MyList<E> implements MyCollection<E> {
    private TreeSet<E> list = new TreeSet<>();

    @Override
    public boolean add(E element) {
        return list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return list.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyIterator<E>() {
            private java.util.Iterator<E> iterator = list.iterator();

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public E next() {
                return iterator.next();
            }
        };
    }
    public void printAll(){
        for (E element : list){
            System.out.println(element);
        }
    }
}
