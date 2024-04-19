package Phan1;

import com.example.de_thi_thu_01.Phan1.KiemTraSo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KiemTraSoTest {
    private KiemTraSo kts = new KiemTraSo();

    @Test
    public void testPass() {
        Assertions.assertTrue(kts.soNguyen("-3"));
    }

    @Test
    public void testPassWithPositiveNumber() {
        Assertions.assertTrue(kts.soNguyen("5"));
    }

    @Test
    public void testPassWithNumberZero() {
        Assertions.assertTrue(kts.soNguyen("0"));
    }

    @Test
    public void testPassWithNumberIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> kts.soNguyen(null));
    }

    @Test
    public void testPassWithNumberIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> kts.soNguyen(""));
    }

    @Test
    public void testPassWithNumberIsNotNumber() {
        Assertions.assertThrows(NumberFormatException.class, () -> kts.soNguyen("asndb"));
    }
}
