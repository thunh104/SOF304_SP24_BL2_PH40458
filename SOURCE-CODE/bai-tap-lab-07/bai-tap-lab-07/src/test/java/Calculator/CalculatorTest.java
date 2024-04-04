package Calculator;

import com.ph40458.baitaplab07.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testMultiplicationPass() {
        Assertions.assertEquals(20, calculator.multiplication(10, 2));
    }

    @Test
    public void testMultiplicationWithTwoNumberIsZero() {
        Assertions.assertEquals(0, calculator.multiplication(0, 0));
    }

    @Test
    public void testMultiplicationWithOneNumberIsZero() {
        Assertions.assertEquals(10, calculator.multiplication(10, 0));
    }

    @Test
    public void testMultiplicationWithTwoNegativeNumber() {
        Assertions.assertEquals(20, calculator.multiplication(-10, -2));
    }

    @Test
    public void testMultiplicationWithOneNegativeNumber() {
        Assertions.assertEquals(-20, calculator.multiplication(0, -20));
    }

    @Test
    public void testDivisionPass() {
        Assertions.assertEquals(69, calculator.divide(138, 2));
    }

    @Test
    public void testDivisionFail() {
        Assertions.assertEquals(20, calculator.divide(40, 4));
    }

    @Test
    public void testDivisionWithNegativeNumber() {
        Assertions.assertEquals(-10, calculator.divide(100, -10));
    }

    @Test
    public void testDivisionWithOneNumberZero() {
        Assertions.assertEquals(0, calculator.divide(0, 10));
    }

    @Test
    public void testDivisionFailWithNumberZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(9, 0));
    }
}
