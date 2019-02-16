package Models;
import Interfaces.Calculator;
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
 * Implementation of the Calculator interface
 */
public class MyCalculator implements Calculator {

    /**
     * private instance for Singleton
     */
    private static MyCalculator instance;

    private MyCalculator(){}

    /**
     * For return an unique instance of MyCalculator
     * @return MyCalculator instance
     */
    public static MyCalculator getInstance(){
        if(instance == null){
            instance = new MyCalculator();
        }
        return instance;
    }

    /**
     * To calculate the result of two numbers, digits 0-9 only
     * @param num1 first picked number of the String
     * @param num2 second picked number of the String
     * @param op   math operator for the previous two numbers
     * @return result of the operation
     */
    @Override
    public int calculate(int num1, int num2, String op) {
        int result = -1;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

        }
        return result;
    }
}
