import Interfaces.Stack;
import Utils.ArrayListStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListStackTest {

    @Test
    public void test(){
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        stack.push(3);
        assertEquals(stack.size(), 1);
        int removedItem = stack.pop();
        assertEquals(removedItem, 3);
        assertEquals(stack.size(), 0);
    }

}