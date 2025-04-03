package implementations;

/**
 * Represents a node in a Doubly Linked List (DLL).
 * Stores an element and references to previous/next nodes.
 * 
 * @param <T> The type of element stored in the node
 */
public class MyDLLNode<T> {
    T element;
    MyDLLNode<T> prev;
    MyDLLNode<T> next;

    /**
     * Constructs a DLL node with specified data
     * @param element The element to store in this node
     */
    public MyDLLNode(T element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }

    /**
     * Gets the element stored in this node
     * @return The element data
     */
    public T getElement() {
        return element;
    }

    /**
     * Sets the element for this node
     * @param element The new element to store
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Gets the previous node reference
     * @return Previous node in the list
     */
    public MyDLLNode<T> getPrev() {
        return prev;
    }

    /**
     * Sets the previous node reference
     * @param prev The new previous node
     */
    public void setPrev(MyDLLNode<T> prev) {
        this.prev = prev;
    }

    /**
     * Gets the next node reference
     * @return Next node in the list
     */
    public MyDLLNode<T> getNext() {
        return next;
    }

    /**
     * Sets the next node reference
     * @param next The new next node
     */
    public void setNext(MyDLLNode<T> next) {
        this.next = next;
    }
}