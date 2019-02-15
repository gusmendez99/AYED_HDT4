package AbstractClasses;

import Interfaces.Stack;

public abstract class AbstractStack<E> implements Stack<E> {
    @Override
    public void push(E item) {
    }

    @Override
    public E pop() {

        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty()
    {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
