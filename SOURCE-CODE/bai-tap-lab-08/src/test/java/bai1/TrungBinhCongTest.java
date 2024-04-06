package bai1;

import com.example.bai_tap_lab_08.bai1.TrungBinhCong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrungBinhCongTest {
    private TrungBinhCong tbc = new TrungBinhCong();
    @Test
    public void testTBCWithNumberZero(){
        int expected = 0;
        double kq = tbc.trungBinhCong3Diem(0,0,0);
        Assertions.assertEquals(0, kq, 0.0001);
    }

    @Test
    public void testUpperBoundary(){
        double kq = tbc.trungBinhCong3Diem(2323444, 23333, 5444);
        Assertions.assertEquals(784073.666667, kq, 0.0001);
    }

    @Test
    public void testEqualPartitioning(){
        double kq = tbc.trungBinhCong3Diem(10,10,10);
        Assertions.assertEquals(10.0, kq, 0.0001);
    }

    @Test
    public void testPassPositiveNumbers(){
        double kq = tbc.trungBinhCong3Diem(20,50,20);
        Assertions.assertEquals(30, kq, 0.0001);
    }

    @Test
    public void testFailPositiveNumbers(){
        double kq = tbc.trungBinhCong3Diem(5, 10,50);
        Assertions.assertEquals(10, kq, 0.0001);
    }

    @Test
    public void testNegativeNumbers(){
        double kq = tbc.trungBinhCong3Diem(-5, -5, -50);
        Assertions.assertEquals(-20, kq, 0.0001);
    }

    @Test
    public void testMixedNumbers(){
        double kq = tbc.trungBinhCong3Diem(-20, -10, 40);
        Assertions.assertEquals(-2.32823, kq, 0.0001);
    }

    @Test
    public void testDecimalNumber(){
        double kq = tbc.trungBinhCong3Diem(2.2, 4.4, 6.6);
        Assertions.assertEquals(6.6, kq, 0.0001);
    }
}
