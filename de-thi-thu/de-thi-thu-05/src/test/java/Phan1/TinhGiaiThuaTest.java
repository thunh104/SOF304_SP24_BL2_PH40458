package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhGiaiThuaTest {
    public TinhGiaiThua tinhGiaiThua = new TinhGiaiThua();

    @Test
    public void testPass() {
        Assertions.assertEquals(120, tinhGiaiThua.giaiThua("5"));
    }

    @Test
    public void testPassWithNumberOne() {
        Assertions.assertEquals(1, tinhGiaiThua.giaiThua("1"));
    }

    @Test
    public void testPassWithNumberZero() {
        Assertions.assertEquals(1, tinhGiaiThua.giaiThua("0"));
    }

    @Test
    public void testNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tinhGiaiThua.giaiThua("-6"));
    }

    @Test
    public void testCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> tinhGiaiThua.giaiThua("abc"));
    }

    @Test
    public void testEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tinhGiaiThua.giaiThua(""));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> tinhGiaiThua.giaiThua(null));
    }
}
