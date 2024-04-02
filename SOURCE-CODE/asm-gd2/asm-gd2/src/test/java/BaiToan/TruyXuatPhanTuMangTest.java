package BaiToan;

import com.ph40458.asmgd2.BaiToan.TruyXuatPhanTuMang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TruyXuatPhanTuMangTest {
    @Test
    public void testArraysPass(){
        TruyXuatPhanTuMang txptm = new TruyXuatPhanTuMang();
        Assertions.assertEquals(3, txptm.truyXuat(2));
    }

    @Test
    public void testArraysFailWithInvalidNumber(){
        TruyXuatPhanTuMang txptm = new TruyXuatPhanTuMang();
        Assertions.assertEquals(5, txptm.truyXuat(5));
    }

    @Test
    public void testArraysWithNumberDoesNotExist(){
        TruyXuatPhanTuMang txptm = new TruyXuatPhanTuMang();
        Assertions.assertEquals(20, txptm.truyXuat(2));
    }
}
