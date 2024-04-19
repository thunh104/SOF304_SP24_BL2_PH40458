package Phan2;

import com.example.de_thi_thu_01.Phan2.DongVat;
import com.example.de_thi_thu_01.Phan2.DongVatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DongVatServiceTest {
    public DongVatService dongVatService = new DongVatService();
    public List<DongVat> listdv = new ArrayList<>();

    @Test
    public void addPass() {
        listdv.add(new DongVat("DV01", "Meo", "Dong vat 4 chan", 20, "Tren bo", 12));
        Assertions.assertTrue(dongVatService.getAll().size() == 3);
    }

    @Test
    public void addFailWithCodeIsEmpty() {
        DongVat dv = new DongVat("", "Meo", "Dong vat 4 chan", 20, "Tren bo", 12);
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(dv));
    }

    @Test
    public void addFailWithHeight() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(new DongVat("DV09", "Meo", "Dong vat 4 chan", 120, "Tren bo", 12)));
    }

    @Test
    public void addFailWithWeight() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(new DongVat("DV05", "Meo", "Dong vat 4 chan", 20, "Tren bo", 120)));
    }

    @Test
    public void addFailWithHeightMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(new DongVat("DV09", "Meo", "Dong vat 4 chan", 12, "Tren bo", 0)));
    }

    @Test
    public void addFailWithWeightMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(new DongVat("DV05", "Meo", "Dong vat 4 chan", 0, "Tren bo", 120)));
    }

    @Test
    public void addFailWithNameIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> dongVatService.addDV(new DongVat("DV05", null, "Dong vat 4 chan", 0, "Tren bo", 120)));
    }

    @Test
    public void addFailWithLoaiIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> dongVatService.addDV(new DongVat("DV05", "Meo", null, 0, "Tren bo", 120)));
    }

    @Test
    public void addFailWithLoaiIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(new DongVat("DV05", "Trang", "", 0, "Tren bo", 120)));
    }

    @Test
    public void addFailWithNameIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.addDV(new DongVat("DV05", "", "Trang", 0, "Tren bo", 120)));
    }

    @Test
    public void removeWithCodeIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.deleteDV(""));
    }

    @Test
    public void removeWithCodeIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> dongVatService.deleteDV(null));
    }

    @Test
    public void removeWithCodeIsSpecialCharacters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dongVatService.deleteDV("DV0@#@"));
    }

    @Test
    public void removeWithCodeIsInvalid() {
        dongVatService.deleteDV("DV10");
        Assertions.assertFalse(dongVatService.getAll().size() == 1);
    }

    @Test
    public void removeWithCodeIsTooLarge() {
        dongVatService.deleteDV("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Assertions.assertFalse(dongVatService.getAll().size() == 1);
    }

    @Test
    public void removePass() {
        dongVatService.deleteDV("DV01");
        Assertions.assertEquals(3, dongVatService.getAll().size());
    }

    @Test
    public void removeWithListIsNull() {
        dongVatService.deleteDV("DV01");
        dongVatService.deleteDV("DV02");
        dongVatService.deleteDV("DV03");
        dongVatService.deleteDV("DV01");
        Assertions.assertFalse(dongVatService.getAll().size() == 0);
    }
}
