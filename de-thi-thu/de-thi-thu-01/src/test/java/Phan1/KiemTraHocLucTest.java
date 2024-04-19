package Phan1;

import com.example.de_thi_thu_01.Phan1.KiemTraHocLuc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KiemTraHocLucTest {
    public KiemTraHocLuc kthl = new KiemTraHocLuc();

    @Test
    public void testHLXS() {
        Assertions.assertTrue(kthl.kiemTraHL("9"));
    }

    @Test
    public void testHLG() {
        Assertions.assertTrue(kthl.kiemTraHL("8"));
    }

    @Test
    public void testHLK() {
        Assertions.assertTrue(kthl.kiemTraHL("7"));
    }

    @Test
    public void testHLTB() {
        Assertions.assertTrue(kthl.kiemTraHL("5"));
    }

    @Test
    public void testHLY() {
        Assertions.assertTrue(kthl.kiemTraHL("1"));
    }

    @Test
    public void testHLWithNull() {
        Assertions.assertThrows(NullPointerException.class, () -> kthl.kiemTraHL(null));
    }

    @Test
    public void testHLWithNumberFormat() {
        Assertions.assertThrows(NumberFormatException.class, () ->kthl.kiemTraHL("sdf"));
    }

}
