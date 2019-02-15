package DesignPatternClasses;
import Utils.CircularList;
import Utils.DoublyLinkedList;
import Utils.SinglyLinkedList;

import java.util.List;

public class ListFactory {
    //Regresa el stack necesario
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
