package Utils;

import AbstractClasses.AbstractList;

public class SinglyLinkedList<E> extends AbstractList<E> {
    private int count; // list size
    private Node<E> head; // ref. to first element

    /**
     * Generates an empty list
     */
    public SinglyLinkedList()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }


    /**
     * Adds a new Node with a value as the tail of the list
     * @param value the value of the new Node
     */
    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<>(value, null);
        if (head != null) {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null) {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;

        count++;
    }

    /**
     * Removes the last Node in the list and returns the value of the deleted Node
     * @return the value of the Node that was eliminated after calling this method
     */
    public E removeLast()
    //pre: list is not empty
    //post: removes last value from list
    {
        Node<E> finger = head;
        Node<E> previous = null;
        while (finger.next() != null) //find end of list
        {
            previous = finger;
            finger = finger.next();
        }
        //finger is null, or points to end of list
        if (previous == null) {
            //has exactly one element
            head = null;
        } else {
            //pointer to last is reset
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }

    /**
     * Returns the size of the list
     * @return the count attribute of the list
     */
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    /**
     * Adds a new Node as with a value to the initial part of the list
     * @param value the value of the new Node
     */
    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<>(value, head);
        count++;
    }

    /**
     * Removes the first Node of the list
     * @return he value of the recently removed Node
     */
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    /**
     * Gets the value of the first Node without removing it from the list
     * @return the value of the first Node of the List
     */
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    /**
     * Removes the Node in position i of the list
     * @param i the index of the Node to remove
     * @return the value of the recently deleted Node
     */
    public E remove(int i)
    //pre: 0<= i < size()
    // post: removes and returns object found at that location
    {
        if (i == 0) return removeFirst();
        else if (i == size() - 1) return removeLast();
        Node<E> previous = null;
        Node<E> finger = head;
// search for value indexed, keep track of previous
        while (i > 0) {
            previous = finger;
            finger = finger.next();
            i--;
        }
// in list, somewhere in middle
        previous.setNext(finger.next());
        count--;
// finger's value is old value, return it
        return finger.value();
    }

    /**
     * Checks if theres a certain value in at least on of the nodes of the list
     * @param value the value to verify if it is in the list
     * @return true if the value is in the list, false otherwise
     */
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Node<E> finger = head;

        while (finger != null &&
                !finger.value().equals(value)) {
            finger = finger.next();
        }
        return finger != null;

    }
}
