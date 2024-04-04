import com.example.bai_tap_lab7.SinhVien.SinhVien;
import com.example.bai_tap_lab7.SinhVien.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    @Test
    public void testAddPass() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.addSinhVien(new SinhVien("5", "Oi", 1, "oi@gmai.com"));
        Assertions.assertTrue(sinhVienService.getSinhVien().size() == 5);
    }

    @Test
    public void testAddFailNameIsEmpty() {
        SinhVienService sinhVienService = new SinhVienService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSinhVien(new SinhVien("5", "", 1, "oi@gmai.com")));
    }

    @Test
    public void testAddFailNameIsNull() {
        SinhVienService sinhVienService = new SinhVienService();
        Assertions.assertThrows(NullPointerException.class, () -> sinhVienService.addSinhVien(new SinhVien("5", null, 1, "oi@gmai.com")));
    }

    @Test
    public void testAddFailClassIsInvalidNegativeNumber() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.addSinhVien(new SinhVien("5", "Quyt", -91, "oi@gmai.com"));
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 5);
    }

    @Test
    public void testAddFailClassIsInvalidPositiveNumber() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.addSinhVien(new SinhVien("5", "Quyt", 2147483647, "oi@gmai.com"));
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 5);
    }

    @Test
    public void testRemovePass() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.removeSinhVien("2");
        Assertions.assertTrue(sinhVienService.getSinhVien().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsFail() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.removeSinhVien("-4");
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsEmpty() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.removeSinhVien("");
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsNull() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.removeSinhVien(null);
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsTooLarge() {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.removeSinhVien("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Assertions.assertFalse(sinhVienService.getSinhVien().size() == 3);
    }
}
