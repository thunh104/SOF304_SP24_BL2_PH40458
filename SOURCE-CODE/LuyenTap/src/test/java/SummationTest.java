import com.example.LuyenTap.TinhTong.Summation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummationTest {
    Summation sum = new Summation();

    @Test
    public void testSumOfZero(){
        // kiem tra tong tu 1 den 0
        int result = sum.sum(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSumOfPositiveNumber(){
        // kiem tra tong tu 1 den so duong bat ky
        int result = sum.sum(5);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testSumOfLargePositiveNumber(){
        // kiem tra tong tu 1 den so duong max
        int result = sum.sum(1000);
        Assertions.assertEquals(500500, result);
    }

    @Test
    public void testSumOfNegativeNumber(){
        // kiem tra so am -> IllegalArgumentException
//        int result = sum.sum(-5);
        Assertions.assertThrows(ArithmeticException.class, () -> sum.sum(-5));
    }

    @Test
    public void testSumOfTen(){
        // kiem tra tong tu 1 den so duong cu the
        int result = sum.sum(10);
        Assertions.assertEquals(55, result);
    }

    @Test
    public void testSumOfNegativeTwo(){
        // truyen vao so am, nem ra ngoai le
        try {
            sum.sum(-2);
        } catch (ArithmeticException e) {
            Assertions.assertEquals("n không phải là số nguyên âm", e.getMessage());
        }
    }
}
