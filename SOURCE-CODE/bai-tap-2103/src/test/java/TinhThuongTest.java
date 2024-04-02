import com.example.baitap2103.TinhThuong3So;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhThuongTest {
    @Test
    public void TestPass() {
        TinhThuong3So tt = new TinhThuong3So();
        Assertions.assertEquals(1, tt.tinhThuong(3, 1, 3));
    }

    @Test
    public void TestFail() {
        TinhThuong3So tt = new TinhThuong3So();
        Assertions.assertEquals(2, tt.tinhThuong(3, 1, 3));
    }
}
