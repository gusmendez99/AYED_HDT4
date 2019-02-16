package Utils;

import AbstractClasses.AbstractList;
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
