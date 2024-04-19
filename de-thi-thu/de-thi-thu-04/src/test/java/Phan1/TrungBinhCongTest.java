package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrungBinhCongTest {
    public TrungBinhCong tbc = new TrungBinhCong();

    @Test
    public void testPass() {
        Assertions.assertEquals(9, tbc.tinhTBC("10", "8", "9"));
    }

    @Test
    public void testMathIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tbc.tinhTBC("", "8", "9"));
    }

    @Test
    public void testMathIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> tbc.tinhTBC(null, "8", "9"));
    }

    @Test
    public void testMathIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> tbc.tinhTBC("asj", "8", "9"));
    }

    @Test
    public void testWithMarkIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tbc.tinhTBC("12", "8", "9"));
    }
}
