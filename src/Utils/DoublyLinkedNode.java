package Utils;

public class DoublyLinkedNode<E> {
    private E data;
    private DoublyLinkedNode<E> nextElement;
    private DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
        // post: constructs a single element
    {
        this(v, null, null);
    }

    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }
    public E value(){
        if (data!= null){
            return data;
        }
        return null;
    }

    public void setNext(DoublyLinkedNode<E> next){
        this.nextElement = next;
    }





}
