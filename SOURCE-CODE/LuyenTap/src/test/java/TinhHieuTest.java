import com.example.LuyenTap.PhepTinh.TinhHieu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhHieuTest {
    TinhHieu th = new TinhHieu();

    @Test
    public void testPass(){
        Assertions.assertEquals("5",th.TinhHieu("10","5"));
    }
    @Test
    public void testFail(){
        Assertions.assertEquals("8",th.TinhHieu("10","5"));
    }
    @Test
    public void testFailWithNumber0(){
        Assertions.assertEquals("5",th.TinhHieu("10","0"));
    }
    @Test
    public void test_FailWithNumber0(){
        Assertions.assertEquals("0",th.TinhHieu("0","5"));
    }
    @Test
    public void testFailWithNumberIsEmpty(){
        Assertions.assertEquals("5",th.TinhHieu("","5"));
    }

    @Test
    public void NumberFormatExceptionTest(){
        Assertions.assertThrows(NumberFormatException.class,()->th.TinhHieu("abc","0"));
    }
}
