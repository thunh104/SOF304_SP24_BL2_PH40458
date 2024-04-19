import org.junit.Before;
import org.junit.Test;
import org.ph31848.Calc;

import java.util.List;

import static org.junit.Assert.*;

public class CalcTest {

    private Calc service;

    @Before
    public void setup(){
        service = new Calc();
    }


    ///////// KIEM TRA SO NGUYEN /////////

    @Test
    public void checkSoNguyen1(){
        Integer number = 0;
        assertTrue(service.kiemTraSoNguyen(number));
    }

    @Test
    public void checkSoNguyen2(){
        Integer number = Integer.MAX_VALUE;
        assertTrue(service.kiemTraSoNguyen(number));
    }

    @Test
    public void checkSoNguyen3(){
        Integer number = Integer.MIN_VALUE;
        assertFalse(service.kiemTraSoNguyen(number));
    }

    @Test
    public void checkSoNguyen4(){
        Integer number = -1;
        assertFalse(service.kiemTraSoNguyen(number));
    }

    @Test
    public void checkSoNguyen5(){
        Integer number = 100;
        assertTrue(service.kiemTraSoNguyen(number));
    }

    @Test
    public void checkSoNguyen6(){
        Integer number = -50;
        assertFalse(service.kiemTraSoNguyen(number));
    }



    ///////// KIEM TRA TICH N-1 CHIA HET CHO 3 VA 5/////////

    @Test(expected = IllegalArgumentException.class)
    public void tinhTich1(){
        Integer n = null;
        service.tichSo(n);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tinhTich2(){
        Integer n = 0;
        service.tichSo(n);
    }

    @Test
    public void tinhTich3(){
        Integer n = 15;
        assertEquals(15, service.tichSo(n), 0.0001);
    }

    @Test
    public void tinhTich4(){
        Integer n = 15;
        assertNotEquals(16, service.tichSo(n), 0.0001);
    }

    @Test
    public void tinhTich5(){
        Integer n = 30;
        assertEquals(450, service.tichSo(n), 0.0001);
    }

    @Test
    public void tinhTich6(){
        Integer n = 30;
        assertNotEquals(150, service.tichSo(n), 0.0001);
    }

}
