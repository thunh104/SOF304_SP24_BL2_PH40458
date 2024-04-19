import com.example.de_thi_thu_02.Tong1NSoLe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tong1NSoLeTest {
    public Tong1NSoLe tong1NSoLe = new Tong1NSoLe();

    @Test
    public void testPass() {
        Assertions.assertEquals(75, tong1NSoLe.tinhTongN("45"));
    }

    @Test
    public void testNumberIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> tong1NSoLe.tinhTongN(null));
    }

    @Test
    public void testNumberIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> tong1NSoLe.tinhTongN("abc"));
    }

    @Test
    public void testNumberIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tong1NSoLe.tinhTongN("null"));
    }

    @Test
    public void testNumberIsNumberMax() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tong1NSoLe.tinhTongN("19282"));
    }


}
