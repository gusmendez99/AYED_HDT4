import Utils.DoublyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {

    @Test
    public void test(){
        DoublyLinkedList<Integer> stack = new DoublyLinkedList<>();
        stack.addLast(3);
        assertEquals(stack.size(), 1);
        int removedItem = stack.removeLast();
        assertEquals(removedItem, 3);
        assertEquals(stack.size(), 0);
    }

}