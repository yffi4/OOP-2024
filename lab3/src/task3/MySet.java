package task3;

import java.util.HashSet;

public class MySet<E> implements MyCollection<E>{
    private HashSet<E> set = new HashSet<>();

    @Override
    public boolean add(E element) {
        return set.add(element);
    }

    @Override
    public boolean remove(E element) {
        return set.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return set.contains(element);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyIterator<E>() {
            private java.util.Iterator<E> iterator = set.iterator();

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

    @Override
    public void printAll(){
        for (E element : set){
            System.out.println(element);
        }
    }
}
