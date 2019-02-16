package Utils;
/**
 * date 02/15/2019
 * @author  Gustavo Andrés, Carné 18500
 * @author  Luis Urbina, Carné 18473
 * This program is designed to calculate a postfix operation using multiple data structures
 * The user will be able to choose between 3 options of stacks and in case he or she selects the
 * ListStack type of Stack, a new window will be prompted asking for what kind of implementation
 * of List he / she wants to use to test the program. All choices point in the same direction, solve
 * the same problem. Code was mostly extracted from Java Structures from Bailey, D.
 */

public class Node<E> {
    private E data; // value stored in this element
    private Node<E> nextElement; // ref to next

    /**
     * Constructs a new Node with a generic value
     * @param v the generic value of the new Node
     * @param next the reference to the next Element
     */
    public Node(E v, Node<E> next)
    // pre: v is a value, next is a reference to
    //      remainder of list
    // post: an element is constructed as the new
    //      head of list
    {
        data = v;
        nextElement = next;
    }

    /**
     * constructs a new tail of a list with value v
     * @param v the value of the new Node
     */

    public Node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v, null);
    }

    /**
     * Resturns the reference to the next value in list
     * @return the reference to the next value in list (Node-type) object
     */
    public Node<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }

    /**
     * Sets reference to new next value
     * @param next the reference to the next Node in list
     */
    public void setNext(Node<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    /**
     * Returns value associated with this element
     * @return value associated with this element
     */
    public E value()
    // post: returns value associated with this element
    {
        return data;
    }

    /**
     * Sets a new value associated with this element
     * @param value the new value to save as data
     */
    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }
}
