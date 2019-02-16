package DesignPatternClasses;
import Interfaces.List;
import Utils.CircularList;
import Utils.DoublyLinkedList;
import Utils.SinglyLinkedList;


/**
 * Class to create a different list depending on the user´s request (as a string)
 */
public class ListFactory {

    /**
     * Returns an instance of a List that inherits AbstractList, the new list will
     * be set as the data of an Stack-type object.
     * @see "StackFactory for the uses of this method"
     * @param requiredList a string according to the decision of the user on what kind of List the program
     * wll use
     * @return the instance of a specific List that inherits form AbstractList or null otherwise
     */
    public List getList(String requiredList){
        if (requiredList != null){
            if (requiredList.equals("SINGLE")){
                return new SinglyLinkedList();
            } else if (requiredList.equals("DOUBLE")){
                return new DoublyLinkedList();
            } else {
                return new CircularList();
            }
        }
        return null;
    }
}
