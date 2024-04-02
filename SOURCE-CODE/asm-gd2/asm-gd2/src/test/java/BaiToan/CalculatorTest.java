package BaiToan;

import com.ph40458.asmgd2.BaiToan.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void TestSumPass() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(4, cal.tinhTong(3, 1));
    }

    @Test
    public void TestSumFail() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(2, cal.tinhTong(3, 1));
    }

    @Test
    public void TestMultiplicationPass() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(10, cal.tinhHieu(13, 3));
    }

    @Test
    public void TestMultiplicationFail() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(11, cal.tinhHieu(13, 1));
    }

    @Test
    public void TestSubtractionPass() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(21, cal.tinhTich(3, 7));
    }

    @Test
    public void TestSubtractionFail() {
        Calculator cal = new Calculator();
        Assertions.assertEquals(22, cal.tinhTich(3, 7));
    }

    @Test
    public void TestSumWithNumIsNotInt() {
        Calculator cal = new Calculator();
        Assertions.assertFalse(cal.checkNumIsInteger(2.023));
    }

    @Test
    public void TestSumWithNumIsCharacters() {
        Calculator cal = new Calculator();
        Assertions.assertTrue(cal.checkNumIsInteger("abcjd"));
    }
}
