package Utils;

import AbstractClasses.AbstractList;

public class CircularList<E> extends AbstractList<E> {

    private Node<E> tail;
    private int count;

    /**
     * constructs a new circular list
     */
    public CircularList()
// pre: constructs a new circular list
    {
        tail = null;
        count = 0;
    }

    /**
     * adds element to head of list
     * @param value the value of the new Node to add
     */
    public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
    {
        Node<E> temp = new Node<>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }

    /**
     * Adds a new Node as the tail of list
     * @param value the value of the new Node
     */
    public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
    {
        // new entry:
        addFirst(value);
        tail = tail.next();
    }

    /**
     * Removes the last Node (tail) of the list
     * @return the value of the recently removed Node
     */
    public E removeLast()
        // pre: !isEmpty()
        // post: returns and removes value from tail of list
    {
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    /**
     * Returns the size of the list
     * @return count attribute of the list
     */
    public int size(){
        return this.count;
    }
}
