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

public class DoublyLinkedNode<E> {
    private E data;
    private DoublyLinkedNode<E> nextElement;
    private DoublyLinkedNode<E> previousElement;

    /**
     * Construct a new list
     * @param v the value if the new element
     * @param next the reference to the next DoublyLinkedNode
     * @param previous the reference to the previous DoublyLinkedNode in the list
     */
    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous)
    //post: constructs a new list
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    /**
     * Constructs a single element
     * @param v the value of the new element
     */
    public DoublyLinkedNode(E v)
        // post: constructs a single element
    {
        this(v, null, null);
    }

    /**
     * returns the reference to a the Node´s previous DoublyLinkedNode
     * @return the reference to a the Node´s previous DoublyLinkedNode
     */
    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }
    public E value(){
        if (data!= null){
            return data;
        }
        return null;
    }

    /**
     * Sets a Node as the reference to the current Node´s nextElement attribute
     * @param next the new Node to set as the current Node's nextElement attribute
     */
    public void setNext(DoublyLinkedNode<E> next){
        this.nextElement = next;
    }





}
