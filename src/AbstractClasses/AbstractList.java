package AbstractClasses;

import Interfaces.List;

import java.util.Iterator;

public abstract class AbstractList<E> implements List<E> {

    @Override
    public int size()
    // post: returns number of elements in list
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
        return false;
    }

    @Override
    public void clear()
    // post: empties list
    {

    }

    @Override
    public void addFirst(E value)
    // post: value is added to beginning of list
    {

    }

    @Override
    public void addLast(E value)
    // post: value is added to end of list
    {

    }

    @Override
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return null;
    }

    @Override
    public E getLast()
    // pre: list is not empty
    // post: returns last value in list
    {
        return null;
    }

    @Override
    public E removeFirst()
    // pre: list is not empty
    // post: removes first value from list
    {
        return null;
    }

    @Override
    public E removeLast()
    // pre: list is not empty
    // post: removes last value from list
    {
        return null;
    }

    @Override
    public E remove(E value)
    // post: removes and returns element equal to value
    // otherwise returns null
    {
        return null;
    }

    @Override
    public void add(E value)
    // post: value is added to tail of list
    {

    }

    @Override
    public E remove()
    // pre: list has at least one element
    // post: removes last value found in list
    {
        return null;
    }

    @Override
    public E get()
    // pre: list has at least one element
    // post: returns last value found in list
    {
        return null;
    }

    @Override
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    {
        return false;
    }

    @Override
    public int indexOf(E value)
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found
    {
        return 0;
    }

    @Override
    public int lastIndexOf(E value)
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found
    {
        return 0;
    }

    @Override
    public E get(int i)
    // pre: 0 <= i < size()
    // post: returns object found at that location
    {
        return null;
    }

    @Override
    public E set(int i, E o)
    // pre: 0 <= i < size()
    // post: sets ith entry of list to value o;
    // returns old value
    {
        return null;
    }

    @Override
    public void add(int i, E o)
    // pre: 0 <= i <= size()
    // post: adds ith entry of list to value o
    {

    }

    @Override
    public E remove(int i)
    // pre: 0 <= i < size()
    // post: removes and returns object found at that location
    {
        return null;
    }

    @Override
    public Iterator<E> iterator()
    // post: returns an iterator allowing
    // ordered traversal of elements in list
    {
        return null;
    }

}
