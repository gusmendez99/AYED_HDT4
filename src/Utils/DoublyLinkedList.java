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

public class DoublyLinkedList<E> extends AbstractList<E> {
    private int count;
    private DoublyLinkedNode<E> head;
    private DoublyLinkedNode<E> tail;

    /**
     * constructs an empty list
     */
    public DoublyLinkedList()
    // post: constructs an empty list
    {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adds a DoublyLinkedNode as the tail of the list
     * @param value the value of the new DoublyLinkedNode
     */
    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
        // construct new element
        tail = new DoublyLinkedNode<>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }

    /**
     * Removes the last DoublyLinkedNode of the list
     * @return the value of the recently removed DoublyLinkedNode
     */
    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
        DoublyLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }

    /**
     * Returns the size of the list
     * @return the count of the list AKA: size of it
     */
    public int size(){
        return this.count;
    }



}
