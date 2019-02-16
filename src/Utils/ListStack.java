package Utils;

import AbstractClasses.AbstractStack;
import DesignPatternClasses.ListFactory;
import Interfaces.List;


public class ListStack<E> extends AbstractStack<E> {
    protected List data;


    public ListStack(String requiredList){
        ListFactory listFactory = new ListFactory();
        data = listFactory.getList(requiredList);
    }

    @Override
    public void push(E item) {
        data.addLast(item);
    }

    @Override
    public E pop() {
        Object value = data.removeLast();
        return (E)value;
    }

    @Override
    public E peek() {
        return super.peek();
    }

    @Override
    public boolean empty() {
        return data.size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }
}
