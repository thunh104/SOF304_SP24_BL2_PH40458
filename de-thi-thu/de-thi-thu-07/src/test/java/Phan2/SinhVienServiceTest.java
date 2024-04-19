package Phan2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    public SinhVienService sinhVienService = new SinhVienService();

    @Test
    public void updatePass() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2004, "UDPM");
        Assertions.assertEquals("Update thanh cong", sinhVienService.updateSV(sv));
    }

    @Test
    public void updateWithStudentCodeNotExists() {
        SinhVien sv = new SinhVien("SV09", "Xoaiii", "Nu", 2004, "UDPM");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.updateSV(sv));
    }

    @Test
    public void updateYear() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2010, "UDPM");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.updateSV(sv));
    }

    @Test
    public void updateGender() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", null, 2004, "UDPM");
        Assertions.assertThrows(NullPointerException.class, () -> sinhVienService.updateSV(sv));
    }

    @Test
    public void updateWithYearFail() {
        SinhVien sv = new SinhVien("SV02", "Xoaiii", "Nu", 1990, "UDPM");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.updateSV(sv));
    }

    @Test
    public void updateEmpty() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2001, "");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.updateSV(sv));
    }

    @Test
    public void updateCNIsEmpty() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2004, null);
        Assertions.assertThrows(NullPointerException.class, () -> sinhVienService.updateSV(sv));
    }

    @Test
    public void addPass() {
        SinhVien sv = new SinhVien("SV06", "Xoaiii", "Nu", 2004, "UDPM");
        Assertions.assertEquals("Add thanh cong", sinhVienService.addSV(sv));
    }

    @Test
    public void addWithStudentCodeExists() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2004, "UDPM");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(sv));
    }

    @Test
    public void addYear() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2010, "UDPM");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(sv));
    }

    @Test
    public void addGender() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", null, 2004, "UDPM");
        Assertions.assertThrows(NullPointerException.class, () -> sinhVienService.addSV(sv));
    }

    @Test
    public void addWithYearFail() {
        SinhVien sv = new SinhVien("SV02", "Xoaiii", "Nu", 1990, "UDPM");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(sv));
    }

    @Test
    public void addEmpty() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2001, "");
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSV(sv));
    }

    @Test
    public void addCNIsEmpty() {
        SinhVien sv = new SinhVien("SV01", "Xoaiii", "Nu", 2004, null);
        Assertions.assertThrows(NullPointerException.class, () -> sinhVienService.addSV(sv));
    }
}
