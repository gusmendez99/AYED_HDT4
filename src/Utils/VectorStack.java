package Utils;

import AbstractClasses.AbstractStack;

import java.util.Vector;

public class VectorStack<E> extends AbstractStack<E> {
    private Vector<E> data;

    /**
     * Constructs a new, empty stack
     */
    public VectorStack(){
        // post: constructs a new, empty stack
        data = new Vector<>(2,0);
    }

    /**
     * Adds a new item to the Vector
     * @param item the item to add to the data Vector
     */
    @Override
    public void push(E item) {
        // post: the value is added to the stack
        //       will be popped next if no intervening push
        {
            data.add(item);
        }
    }

    /**
     * Removes and retrieves the last element in the vector
     * @return the value of the last element in the vector, previously removed
     */
    @Override
    public E pop() {
        if(!this.data.isEmpty()){
            int size = data.size();
            return data.remove(size - 1);
        }
        return null;
    }

    /**
     * Eetrieves the last element in the vector without removing it
     * @return the value of the last element in the data Vector
     */
    @Override
    public E peek() {
        return null;
    }

    /**
     * Returns the state of the Vector
     * @return true if it is empty, false otherwise
     */
    @Override
    public boolean empty() {
        return false;
    }

    /**
     * Returns the size of the data Vector
     * @return size of the data Vector
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Returns a string of the data
     * @return the data as a String
     */
    @Override
    public String toString() {
        return data.toString();
    }
}
