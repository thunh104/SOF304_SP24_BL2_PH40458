package Phan2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NhanVienServiceTest {
    public NhanVienService nhanVienService = new NhanVienService();

    @Test
    public void testAddPass() {
        nhanVienService.addNV(new NhanVien(6, "NV02", "Thu", "Thu", "Nhan vien", 120000));
        Assertions.assertEquals(6, nhanVienService.getAll().size());
    }

    @Test
    public void testAddFail() {
        NhanVien nv = new NhanVien(6, "NV02", "@as", "Thu", "Nhan vien", 120000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.addNV(nv));
    }

    @Test
    public void testAddFailWithCodeEmployeeIsNull() {
        NhanVien nv = new NhanVien(6, null, "Thu", "Thu", "Nhan vien", 120000);
        Assertions.assertThrows(NullPointerException.class, () -> nhanVienService.addNV(nv));
    }

    @Test
    public void testAddFailWithSalaryInvalidMin() {
        NhanVien nv = new NhanVien(6, "NV02", "Hoai", "Thu", "Nhan vien", 9000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.addNV(nv));
    }

    @Test
    public void testAddFailWithSalaryInvalidMax() {
        NhanVien nv = new NhanVien(6, "NV02", "Hoai", "Thu", "Nhan vien", 20000000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.addNV(nv));
    }

    @Test
    public void searchPass() {
        Assertions.assertEquals(3, nhanVienService.searchByName("Nguyen"));
    }

    @Test
    public void searchWithSpecialCharacter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.searchByName("!#js"));
    }

    @Test
    public void searchWithNull() {
        Assertions.assertThrows(NullPointerException.class, () -> nhanVienService.searchByName(null));
    }

    @Test
    public void searchWithEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.searchByName(""));
    }
}
