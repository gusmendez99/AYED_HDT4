package Interfaces;
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
 * Interface of a Math Calculator
 */
public interface Calculator {
    /**
     * @param num1 first picked number of the String
     * @param num2 second picked number of the String
     * @param op math operator for the previous two numbers
     * @return the result of the operation between this two numbers
     */
    int calculate(int num1, int num2, String op);
}
