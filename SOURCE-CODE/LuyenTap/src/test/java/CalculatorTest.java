import com.example.LuyenTap.TinhToan.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public  void testDivisionPass(){
        Assertions.assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void testDivisionFail(){
        Assertions.assertEquals(8, calculator.divide(10, 5));
    }

    @Test
    public void testNegativeNumber(){
        Assertions.assertEquals(10, calculator.divide(10, -1));
    }

    @Test
    public void testNumber(){
        Assertions.assertEquals(0, calculator.divide( 0, 5));
    }

    @Test
    public void testDivision(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(2,0));
    }
}
