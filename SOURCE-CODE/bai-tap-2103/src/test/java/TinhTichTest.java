import com.example.baitap2103.TinhTich3So;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhTichTest {
    @Test
    public void TestPass(){
        TinhTich3So tt = new TinhTich3So();
        Assertions.assertEquals(6, tt.tinhTich(1, 2, 3));
    }

    @Test
    public void TestFail(){
        TinhTich3So tt = new TinhTich3So();
        Assertions.assertEquals(7, tt.tinhTich(1,2, 3));
    }
}
