package AbstractClasses;

import Interfaces.Stack;
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
