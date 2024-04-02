package SinhVien;

import com.ph40458.asmgd2.SinhVien.entity.SinhVien;
import com.ph40458.asmgd2.SinhVien.service.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SinhVienTest {
    @Test
    public void testAddPass() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.addSinhVien(new SinhVien("1", "Dao", "HG02", "Mua Xuan", "SV06"));
        Assertions.assertTrue(sinhVienService.getSinhVien().size() == 6);
    }

    @Test
    public void testAddFailNameIsEmpty() {
        try {
            SinhVienService sinhVienService = new SinhVienService();
            sinhVienService.addSinhVien(new SinhVien("1", "", "HG02", "Mua Xuan", "SV06"));
            System.out.println("Add failed because name is empty");
        } catch (IllegalArgumentException e) {
            SinhVienService sinhVienService = new SinhVienService();
            Assertions.assertTrue(sinhVienService.getSinhVien().size() == 6);
        }
    }

    @Test
    public void testAddFailNameIsNull() {
        try {
            SinhVienService sinhVienService = new SinhVienService();
            sinhVienService.addSinhVien(new SinhVien("1", null, "HG02", "Mua Xuan", "SV06"));
            System.out.println("Add failed because name is null");
        } catch (IllegalArgumentException e) {
            SinhVienService sinhVienService = new SinhVienService();
            Assertions.assertTrue(sinhVienService.getSinhVien().size() == 6);
        }
    }


    @Test
    public void testAddFailWithClassName() {
        SinhVienService sinhVienService = new SinhVienService();
        SinhVien sv = new SinhVien();
        String tl = sv.setTenLop("SD!@#%");
        sinhVienService.addSinhVien(new SinhVien("6", "Le", "HG02", tl, "SV06"));
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 6);
    }

    @Test
    public void testSearchByName() {
        SinhVienService sinhVienService = new SinhVienService();
        List<SinhVien> listsv = sinhVienService.searchByName("Xoai");
        Assertions.assertEquals("Xoai", listsv.get(0).getHoTen());
    }

    @Test
    public void testSearchByIdClass() {
        SinhVienService sinhVienService = new SinhVienService();
        List<SinhVien> listsv = sinhVienService.searchByIdClass("HG02");
        Assertions.assertEquals(2, listsv.size());
    }

    @Test
    public void testSearchByIdStudent() {
        SinhVienService sinhVienService = new SinhVienService();
        SinhVien sv = sinhVienService.searchByIdStudent("SV03");
        Assertions.assertEquals("SV03", sv.getMasv());
    }

    @Test
    public void testSearchByIdClassInvalid() {
        SinhVienService sinhVienService = new SinhVienService();
        List<SinhVien> listsv = sinhVienService.searchByIdClass("HG07");
        Assertions.assertEquals("HG07", listsv.get(2).getHoTen());
    }

    @Test
    public void testSearchByIdStudentInvalid() {
        SinhVienService sinhVienService = new SinhVienService();
        SinhVien sv = sinhVienService.searchByIdStudent("SV07");
        Assertions.assertEquals("SV07", sv.getMasv());
    }
}
