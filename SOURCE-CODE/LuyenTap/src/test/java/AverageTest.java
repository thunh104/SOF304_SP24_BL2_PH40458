import com.example.LuyenTap.TinhTrungBinhCong.Average;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageTest {

    Average avg = new Average();
    @Test
    public void testLowerBoundary(){
        // kiem tra bien tren
        double result = Average.AverageOfThreeNumber(0,0,0);
        Assertions.assertEquals(0, result, 0.0001);
    }

    @Test
    public void testUpperBoundary(){
        // kiem tra bien duoi
        double result = Average.AverageOfThreeNumber(112273, 2563, 3462);
        Assertions.assertEquals(39432.666666666664, result, 0.0001);
    }

    @Test
    public void testEqualPartitioning(){
        // kiem tra gia tri tuong duong nhau
        double result = Average.AverageOfThreeNumber(10,10,10);
        Assertions.assertEquals(10.0, result, 0.0001);
    }

    @Test
    public void testPassPositiveNumbers(){
        // kiem tra so duong voi truong hop dung
        double result = Average.AverageOfThreeNumber(10,23,12);
        Assertions.assertEquals(15, result, 0.0001);
    }

    @Test
    public void testFailPositiveNumbers(){
        // kiem tra so duong voi truong hop sai
        double result = Average.AverageOfThreeNumber(5, 10,27);
        Assertions.assertEquals(10, result, 0.0001);
    }

    @Test
    public void testNegativeNumbers(){
        // kiem tra so am
        double result = Average.AverageOfThreeNumber(-5, -5, -5);
        Assertions.assertEquals(-5, result, 0.0001);
    }

    @Test
    public void testMixedNumbers(){
        // kiem tra voi so am, so duong
        double result = Average.AverageOfThreeNumber(-20, -10, 20);
        Assertions.assertEquals(-3.3333333333333335, result, 0.0001);
    }

    @Test
    public void testDecimalNumber(){
        // kiem tra voi so thap phan
        double result = Average.AverageOfThreeNumber(1.1, 2.2, 3.3);
        Assertions.assertEquals(2.2, result, 0.0001);
    }
}
