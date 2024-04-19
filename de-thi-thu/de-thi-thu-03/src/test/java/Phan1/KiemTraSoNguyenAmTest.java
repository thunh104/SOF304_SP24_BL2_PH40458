package Phan1;

import com.example.de_thi_thu_03.Phan1.KiemTraSoNguyenAm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoNguyenAmTest {
    public KiemTraSoNguyenAm kiemTraSoNguyenAm = new KiemTraSoNguyenAm();

    @Test
    public void testPass() {
        Assertions.assertEquals(-5, kiemTraSoNguyenAm.kiemTra());
    }

}