package implementations;

import utilities.QueueADT;
import exceptions.EmptyQueueException;
import utilities.Iterator;
import java.util.NoSuchElementException;

public class MyQueue<E> implements QueueADT<E> {

    private MyDLL<E> list;

    public MyQueue() {
        list = new MyDLL<>();
    }

    @Override
    public void enqueue(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot enqueue null element");
        }
        list.add(toAdd);
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Cannot dequeue from empty queue");
        }
        return list.remove(0);
    }

    @Override
    public E peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Cannot peek empty queue");
        }
        return list.get(0);
    }

    @Override
    public void dequeueAll() {
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(E toFind) throws NullPointerException {
        if (toFind == null) {
            throw new NullPointerException("Cannot search for null element");
        }
        return list.contains(toFind);
    }

    @Override
    public int search(E toFind) {
        int position = 1;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (toFind.equals(it.next())) {
                return position;
            }
            position++;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public boolean equals(QueueADT<E> that) {
        if (that == null) return false;
        if (this.size() != that.size()) return false;
        
        Iterator<E> thisIterator = this.iterator();
        Iterator<E> thatIterator = that.iterator();
        
        while (thisIterator.hasNext()) {
            if (!thisIterator.next().equals(thatIterator.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public E[] toArray(E[] holder) throws NullPointerException {
        return list.toArray(holder);
    }

    @Override
    public boolean isFull() {
        return false; // MyDLL-based queue is never full
    }

    @Override
    public int size() {
        return list.size();
    }
}