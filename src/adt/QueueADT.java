package adt;

import java.util.NoSuchElementException;

/**
 * An interface representing the standard operations of a queue data structure.
 * <p>
 * A queue is a First-In-First-Out (FIFO) data structure. Implementations of this
 * interface must provide methods for adding elements to the rear of the queue and
 * removing them from the front. This interface is generic and can be used with any
 * object type.
 * </p>
 *
 * @param <T> the type of elements held in this queue
 */
public interface QueueADT<T> {

    /**
     * Adds the specified element to the rear of this queue.
     *
     * <p><strong>Postcondition:</strong> The element is added to the end of the queue,
     * and the size of the queue increases by one.</p>
     *
     * @param element the element to be added to the queue
     */
    public void enqueue(T element);

    /**
     * Removes and returns the element at the front of this queue.
     *
     * <p><strong>Precondition:</strong> The queue is not empty.</p>
     * <p><strong>Postcondition:</strong> The element at the front is removed, and the queue's 
     * size decreases by one.</p>
     *
     * @return the element that was removed from the front of this queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue() throws NoSuchElementException;

    /**
     * Returns (but does not remove) the element at the front of this queue.
     *
     * <p><strong>Precondition:</strong> The queue is not empty.</p>
     * <p><strong>Postcondition:</strong> The queue remains unchanged.</p>
     *
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T first() throws NoSuchElementException;

    /**
     * Checks if this queue contains no elements.
     *
     * @return {@code true} if the queue is empty; {@code false} otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements currently contained in this queue.
     *
     * @return the current size of the queue
     */
    public int size();
}
