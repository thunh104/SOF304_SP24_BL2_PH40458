package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimSoLonThuHaiTest {
    public TimSoLonThuHai soLonThuHai = new TimSoLonThuHai();

    @Test
    public void testPass() {
        int[] array = {3, 4, 5, 7, 8, 9};
        Assertions.assertEquals(8, soLonThuHai.findMaxTwo(array));
    }

    @Test
    public void testNumber() {
        int[] array = {9, 9, 9};
        Assertions.assertEquals(0, soLonThuHai.findMaxTwo(array));
    }

    @Test
    public void testArrayEmpty() {
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> soLonThuHai.findMaxTwo(array));
    }
}
