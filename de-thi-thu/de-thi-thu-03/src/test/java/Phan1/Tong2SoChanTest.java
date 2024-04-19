package Phan1;

import com.example.de_thi_thu_03.Phan1.Tong2SoChan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tong2SoChanTest {
    public Tong2SoChan tong2SoChan = new Tong2SoChan();

    @Test
    public void testSumWithNumberIsValid() {
        Assertions.assertEquals(4, tong2SoChan.tongSoChan("2", "2"));
    }

    @Test
    public void testSumWithNumberIsInvalid() {
        Assertions.assertEquals(0, tong2SoChan.tongSoChan("5", "2"));
    }

    @Test
    public void testSumWithNumberIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> tong2SoChan.tongSoChan("a", "2"));
    }

    @Test
    public void testSumWithNumberIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tong2SoChan.tongSoChan("", "2"));
    }

    @Test
    public void testSumWithNumberIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> tong2SoChan.tongSoChan(null, "2"));
    }
}
