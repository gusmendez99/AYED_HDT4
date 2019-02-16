import Interfaces.Calculator;
import Models.MyCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void test(){
        MyCalculator calculator = MyCalculator.getInstance();
        int result = calculator.calculate(5, 2, "+");
        assertEquals(7, result);
    }

}