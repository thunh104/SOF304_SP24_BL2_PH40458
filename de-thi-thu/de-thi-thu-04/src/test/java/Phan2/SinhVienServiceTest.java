package Phan2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    public SinhVienService sinhVienService = new SinhVienService();

    @Test
    public void testWithStudentCodeIsExist() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(new SinhVien("SV01", "Xoai", 19, 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithAgeIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> sinhVienService.addSV(new SinhVien("SV07", "Xoai", Integer.valueOf("sjs"), 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithAgeIsEmpty() {
        Assertions.assertThrows(NumberFormatException.class, () -> sinhVienService.addSV(new SinhVien("SV08", "Xoai", Integer.valueOf(""), 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithAgeIsInvalidMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(new SinhVien("SV09", "Xoai", 12, 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithAgeIsValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(new SinhVien("SV09", "Xoai", 120, 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithAgeIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(new SinhVien("SV09", "Xoai", 17, 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithAgeIsInvalidMax() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(new SinhVien("SV09", "Xoai", 129, 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithStudentCodeIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> sinhVienService.addSV(new SinhVien(null, "Xoai", 19, 9.6, 5, "PTPM")));
    }

    @Test
    public void testWithStudentCodeIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(new SinhVien("", "Xoai", 18, 9.6, 5, "PTPM")));
    }

    @Test
    public void testPass() {
        int expected = 6;
        sinhVienService.addSV(new SinhVien("SV10", "Chanh", 18, 9, 5, "XLDL"));
        int actual = sinhVienService.getAll().size();
        Assertions.assertEquals(expected, actual);
    }
}
