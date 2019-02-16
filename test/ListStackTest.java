import Utils.ListStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListStackTest {

    @Test
    public void test(){
        ListStack<Integer> stack = new ListStack<>("");
        stack.push(3);
        assertEquals(stack.size(), 1);
        int removedItem = stack.pop();
        assertEquals(removedItem, 3);
        assertEquals(stack.size(), 0);
    }

}