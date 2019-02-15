package Utils;

import AbstractClasses.AbstractStack;

import java.util.Vector;

public class VectorStack<E> extends AbstractStack<E> {
    private Vector<E> data;

    public VectorStack(){
        // post: constructs a new, empty stack
        data = new Vector<>(2,0);
    }

    @Override
    public void push(E item) {
        // post: the value is added to the stack
        //       will be popped next if no intervening push
        {
            data.add(item);
        }
    }

    @Override
    public E pop() {
        if(!this.data.isEmpty()){
            int size = data.size();
            return data.remove(size - 1);
        }
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
