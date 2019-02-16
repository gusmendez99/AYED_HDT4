import Utils.CircularList;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularListTest {

    @Test
    public void test(){
        CircularList<Integer> stack = new CircularList<>();
        stack.addLast(3);
        assertEquals(stack.size(), 1);
        int removedItem = stack.removeLast();
        assertEquals(removedItem, 3);
        assertEquals(stack.size(), 0);
    }

}