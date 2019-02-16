import Utils.VectorStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorStackTest {

    @Test
    public void test(){
        VectorStack<Integer> stack = new VectorStack<>();
        stack.push(3);
        assertEquals(stack.size(), 1);
        int removedItem = stack.pop();
        assertEquals(removedItem, 3);
        assertEquals(stack.size(), 0);
    }

}