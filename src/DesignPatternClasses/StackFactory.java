package DesignPatternClasses;

import Interfaces.Stack;
import Utils.ArrayListStack;
import Utils.ListStack;
import Utils.VectorStack;

/**
 *  Class to create a different Stack-type object depending on the user´s request (as a string)
 */

public class StackFactory {
    /**
     * Returns an instance of a Stack-type object for the Main class to work with
     * @param requiredStack the String with the name of the type of the Stack to instance in Main.java
     * @param requiredList the String with the name of the type of the List to instance as data
     * of a ListStack-type object.
     * @return
     */
    public static Stack getStack(String requiredStack, String requiredList) {
        if (requiredStack != null){
            if (requiredStack.equals("VECTOR")){
                return new VectorStack();
            } else if (requiredStack.equals("ARRAYLIST")){
                return new ArrayListStack();
            } else {
                return new ListStack(requiredList);
            }
        }
        return null;
    }
}
