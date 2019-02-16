package Utils;

import AbstractClasses.AbstractStack;
import DesignPatternClasses.ListFactory;
import Interfaces.List;


public class ListStack<E> extends AbstractStack<E> {
    private List data;

    /**
     * Constructs a new Stack with a List-type object as data
     * @param requiredList the name of the type of the List to construct
     */
    public ListStack(String requiredList){
        ListFactory listFactory = new ListFactory();
        data = listFactory.getList(requiredList);
    }

    /**
     * Pushes an object in the data List
     * @param item the item to add to the List
     */
    @Override
    public void push(E item) {
        data.addLast(item);
    }

    /**
     * Extracts and deletes from the list the last object
     * @return the recently deleted value
     */
    @Override
    public E pop() {
        Object value = data.removeLast();
        return (E)value;
    }

    /**
     * retrieves the last element of the List without deleting it
     * @return the value of the last element
     */
    @Override
    public E peek() {
        return super.peek();
    }

    /**
     * Returns the state of the List, depending of if it is empty or not
     * @return true if it is empty, false otherwise
     */
    @Override
    public boolean empty() {
        return data.size() == 0;
    }

    /**
     * Retrieves the size of the List
     * @return an int representing the size of the list
     */
    @Override
    public int size() {
        return data.size();
    }
}
