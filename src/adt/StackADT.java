package adt;

import java.util.NoSuchElementException;

/**
 * An interface representing the operations for a stack data structure.
 * <p>
 * A stack is a Last-In-First-Out (LIFO) data structure. Implementations of this interface
 * must provide support for typical stack operations such as push, pop, and peek.
 * </p>
 *
 * @param <T> the type of elements held in this stack
 */
public interface StackADT<T> {

    /**
     * Adds the specified element to the top of this stack.
     *
     * <p><strong>Postcondition:</strong> The element is added to the top of the stack.</p>
     *
     * @param element the element to be added to the stack
     */
    void push(T element);

    /**
     * Removes and returns the element at the top of this stack.
     *
     * <p><strong>Precondition:</strong> The stack is not empty.</p>
     * <p><strong>Postcondition:</strong> The top element is removed from the stack.</p>
     *
     * @return the element removed from the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    T pop() throws NoSuchElementException;

    /**
     * Returns (but does not remove) the element at the top of this stack.
     *
     * <p><strong>Precondition:</strong> The stack is not empty.</p>
     *
     * @return the element at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    T peek() throws NoSuchElementException;

    /**
     * Checks if this stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in the stack
     */
    int size();
}
