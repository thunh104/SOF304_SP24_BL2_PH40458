package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinhPhuongSoChanLeTest {
    public BinhPhuongSoChanLe soChanLe = new BinhPhuongSoChanLe();

    @Test
    public void testPassChan() {
        Assertions.assertEquals("So chan", soChanLe.binhPhuong("2"));
    }

    @Test
    public void testPassLe() {
        Assertions.assertEquals("So le", soChanLe.binhPhuong("3"));
    }

    @Test
    public void testEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> soChanLe.binhPhuong(""));
    }

    @Test
    public void testCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> soChanLe.binhPhuong("acb"));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> soChanLe.binhPhuong(null));
    }

    @Test
    public void testNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> soChanLe.binhPhuong("-2"));
    }
}
