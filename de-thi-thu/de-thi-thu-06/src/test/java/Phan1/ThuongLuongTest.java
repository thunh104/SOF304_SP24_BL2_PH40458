package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThuongLuongTest {
    public ThuongLuong thuongLuong = new ThuongLuong();

    @Test
    public void testWithSoNam2() {
        Assertions.assertEquals("Thuong 20 trieu", thuongLuong.tienLuong("10"));
    }

    @Test
    public void testWithSoNam3() {
        Assertions.assertEquals("Thuong 10 trieu", thuongLuong.tienLuong("3"));
    }

    @Test
    public void testWithSoNam4() {
        Assertions.assertEquals("Thuong 10 trieu", thuongLuong.tienLuong("4"));
    }

    @Test
    public void testWithSoNam5() {
        Assertions.assertEquals("Thuong 10 trieu", thuongLuong.tienLuong("5"));
    }

    @Test
    public void testWithSoNam6() {
        Assertions.assertEquals("Thuong 10 trieu", thuongLuong.tienLuong("6"));
    }
}
