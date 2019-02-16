package DesignPatternClasses;

import Interfaces.Stack;
import Utils.ArrayListStack;
import Utils.ListStack;
import Utils.VectorStack;

/**
 * date 02/15/2019
 * @author  Gustavo Andrés, Carné 18500
 * @author  Luis Urbina, Carné 18473
 * This program is designed to calculate a postfix operation using multiple data structures
 * The user will be able to choose between 3 options of stacks and in case he or she selects the
 * ListStack type of Stack, a new window will be prompted asking for what kind of implementation
 * of List he / she wants to use to test the program. All choices point in the same direction, solve
 * the same problem. Code was mostly extracted from Java Structures from Bailey, D.
 */

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
