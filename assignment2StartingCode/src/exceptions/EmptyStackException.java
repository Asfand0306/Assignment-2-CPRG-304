package exceptions;

/**
 * Custom exception class for StackADT implementations. 
 * Thrown when an operation attempts to access or remove 
 * elements from an empty stack.
 */
public class EmptyStackException extends Exception {
    /**
     * Unique identifier for serialization/deserialization.
     * Ensures proper version control when serializing instances.
     */
    private static final long serialVersionUID = 682267963980463372L; // Different from Queue version

    /**
     * Constructs a new EmptyStackException with default message.
     * Used when no specific error details are required.
     */
    public EmptyStackException() {
        super();
    }

    /**
     * Constructs a new EmptyStackException with custom message.
     * 
     * @param message Specific error details for exception handling.
     *                Example: "Cannot pop from an empty stack"
     */
    public EmptyStackException(String message) {
        super(message);
    }
}