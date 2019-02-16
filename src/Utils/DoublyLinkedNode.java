package Utils;

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
