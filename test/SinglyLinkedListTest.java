import Utils.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void test(){
        SinglyLinkedList<Integer> stack = new SinglyLinkedList<>();
        stack.addLast(3);
        assertEquals(stack.size(), 1);
        int removedItem = stack.removeLast();
        assertEquals(removedItem, 3);
        assertEquals(stack.size(), 0);
    }

}