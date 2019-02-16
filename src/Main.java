import DesignPatternClasses.StackFactory;
import Interfaces.Calculator;
import Interfaces.Stack;
import Models.MyCalculator;

import java.util.ArrayList;

public class Main {

    /**
     * For init the app
     *
     * @param args the default instance args of the Main
     */
    public static void main(String[] args) {
        Calculator myCalculator = new MyCalculator();
        Stack myPila = StackFactory.getStack("LIST", "CIRCULAR");
        ArrayList<String> finalInputArrayList = new ArrayList<>();
        finalInputArrayList.add("1");
        finalInputArrayList.add("2");
        finalInputArrayList.add("+");
        finalInputArrayList.add("4");
        finalInputArrayList.add("*");
        finalInputArrayList.add("3");
        finalInputArrayList.add("+");


        int result = 0;

        for (int i = 0; i < finalInputArrayList.size(); i++) {
            System.out.println(finalInputArrayList.get(i));
            System.out.println(myPila.toString());
            if (finalInputArrayList.get(i).equals("+") || finalInputArrayList.get(i).equals("*") ||
                    finalInputArrayList.get(i).equals("-") || finalInputArrayList.get(i).equals("/")) {
                if (finalInputArrayList.get(i).equals("/") && finalInputArrayList.get(i - 1).equals("0")) {
                    myPila.pop();
                    System.out.println("No se puede dividir entre cero!");
                } else {
                    int num2 = (Integer) myPila.pop();
                    int num1 = (Integer) myPila.pop();
                    result = myCalculator.calculate(num1, num2, finalInputArrayList.get(i));
                    myPila.push(result);
                    System.out.println("Se ha ejecutado la operación: " + num2 + " " + finalInputArrayList.get(i) + " " + num1);
                    System.out.println("el estado actual de la pila es: " + myPila.toString());
                }
            } else {
                myPila.push(Integer.parseInt(finalInputArrayList.get(i)));
            }
        }
        System.out.println(result);
    }


}
