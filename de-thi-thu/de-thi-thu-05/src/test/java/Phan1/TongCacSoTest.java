package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TongCacSoTest {
    public TongCacSo tongCacSo = new TongCacSo();

    @Test
    public void testPass() {
        Assertions.assertEquals(75, tongCacSo.tinhTong("45"));
    }

    @Test
    public void testFail() {
        Assertions.assertEquals(0, tongCacSo.tinhTong("16"));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> tongCacSo.tinhTong(null));
    }

    @Test
    public void testEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tongCacSo.tinhTong(""));
    }

    @Test
    public void testCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> tongCacSo.tinhTong("abc"));
    }

    @Test
    public void testNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tongCacSo.tinhTong("-4"));
    }
}
