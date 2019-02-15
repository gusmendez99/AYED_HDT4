package Utils;

import AbstractClasses.AbstractStack;
import DesignPatternClasses.ListFactory;

import java.util.List;

public class ListStack<E> extends AbstractStack<E> {
    protected List<E> data;


    public ListStack(String requiredList){
        ListFactory listFactory = new ListFactory();
        data = listFactory.getList(requiredList);
    }

    @Override
    public void push(E item) {
        super.push(item);
    }

    @Override
    public E pop() {
        return super.pop();
    }

    @Override
    public E peek() {
        return super.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }

    @Override
    public int size() {
        return super.size();
    }
}
