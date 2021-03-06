package Utils;

import AbstractClasses.AbstractStack;
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

import java.util.ArrayList;

public class ArrayListStack<E> extends AbstractStack<E> {
    private ArrayList<E> data;

    /**
     * constructs a new, empty stack
     */
    public ArrayListStack()
    // post: constructs a new, empty stack
    {
        data = new ArrayList<>();
    }

    /**
     * Adds a value of type E to the stack
     * @param item the value to add to the data ArrayList
     */
    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.add(item);
    }

    /**
     * Retrieves and eliminates the last value from the ArrayList
     * @return the value of the last element of the ArrayList
     */
    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size()-1);
    }

    /**
     * Retrieves but doesn't eliminate the last value from the ArrayList
     * @return the value of the last element of the ArrayList
     */
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }

    /**
     * Gets the size of the ArrayList
     * @return size of the ArrayList as an int
     */
    public int size()
    // post: returns the number of elements in the stack
    {
        return data.size();
    }

    /**
     * verifies if the data ArrayList is empty or not
     * @return true if and only if the stack is empty
     */
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
        return size() == 0;
    }



}
