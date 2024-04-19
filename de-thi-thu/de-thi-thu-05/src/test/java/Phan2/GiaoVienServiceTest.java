package Phan2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class GiaoVienServiceTest {
    public GiaoVienService giaoVienService = new GiaoVienService();

    @Test
    public void testAddPass() {
        GiaoVien gv = new GiaoVien(5, "GV08", "Thu", new Date(2004, 10, 22), "Ha Noi", 3);
        giaoVienService.addGV(gv);
        Assertions.assertEquals(5, giaoVienService.getAll().size());
    }

    @Test
    public void testWithTeacherCode() {
        GiaoVien gv = new GiaoVien(5, "SP07", "Thu", new Date(2004, 10, 22), "Ha Noi", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> giaoVienService.addGV(gv));
    }

    @Test
    public void testCodeIsNull() {
        GiaoVien gv = new GiaoVien(5, null, "Thu", new Date(2004, 10, 22), "Ha Noi", 3);
        Assertions.assertThrows(NullPointerException.class, () -> giaoVienService.addGV(gv));
    }

    @Test
    public void testNameIsEpty() {
        GiaoVien gv = new GiaoVien(5, "GV08", "", new Date(2004, 10, 22), "Ha Noi", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> giaoVienService.addGV(gv));
    }

    @Test
    public void testYear() {
        GiaoVien gv = new GiaoVien(5, "GV08", "Thu", new Date(2004, 10, 22), "Ha Noi", -1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> giaoVienService.addGV(gv));
    }

    @Test
    public void testSearchPass() {
        Assertions.assertEquals(2, giaoVienService.searchByName("Thu"));
    }

    @Test
    public void testCharacter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> giaoVienService.searchByName("@#"));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> giaoVienService.searchByName(null));
    }
}
