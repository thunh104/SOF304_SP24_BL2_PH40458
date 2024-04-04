package BaiHat;

import com.ph40458.baitaplab07.BaiHat.entity.BaiHat;
import com.ph40458.baitaplab07.BaiHat.service.BaiHatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaiHatTest {
    private BaiHatService service = new BaiHatService();

    @Test
    public void testAddPass() {
        service.addBH(new BaiHat("5", "sout", "Noo Phuoc Thinh", 50, "Trinh Cong Son"));
        Assertions.assertTrue(service.getBaiHat().size() == 5);
    }

    @Test
    public void testAddFailNameIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addBH(new BaiHat("6", "", "Trinh Thang Binh", 50, "Viruss")));
    }

    @Test
    public void testAddFailNameIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> service.addBH(new BaiHat("6", null, "Trinh Thang Binh", 50, "Viruss")));
    }

    @Test
    public void testAddFailClassIsInvalidNegativeNumber() {
        service.addBH(new BaiHat("6", "Quyt", "Trinh Thang Binh", -50, "Viruss"));
        Assertions.assertFalse(service.getBaiHat().size() == 5);
    }

    @Test
    public void testAddFailClassIsInvalidNegativeNumber2() {
        service.addBH(new BaiHat("6", "Quyt", "Trinh Thang Binh", 2147483647, "Viruss"));
        Assertions.assertFalse(service.getBaiHat().size() == 5);
    }

    @Test
    public void testRemovePass() {
        service.removeBH("2");
        Assertions.assertTrue(service.getBaiHat().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsFail() {
        service.removeBH("-4");
        Assertions.assertFalse(service.getBaiHat().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsEmpty() {
        service.removeBH("");
        Assertions.assertFalse(service.getBaiHat().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsNull() {
        service.removeBH(null);
        Assertions.assertFalse(service.getBaiHat().size() == 3);
    }

    @Test
    public void testRemoveFailWithClassIsTooLarge() {
        service.removeBH("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Assertions.assertFalse(service.getBaiHat().size() == 3);
    }
}
