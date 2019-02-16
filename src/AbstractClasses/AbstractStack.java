package AbstractClasses;

import Interfaces.Stack;

public abstract class AbstractStack<E> implements Stack<E> {
    @Override
    public void push(E item)
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push
    {
    }

    @Override
    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return null;
    }

    @Override
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return null;
    }

    @Override
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
        return false;
    }

    @Override
    public int size()
    // post: returns the number of elements in the stack
    {
        return 0;
    }
}
