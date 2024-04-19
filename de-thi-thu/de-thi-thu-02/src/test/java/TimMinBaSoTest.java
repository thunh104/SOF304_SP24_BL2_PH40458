import com.example.de_thi_thu_02.TimMinBaSo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimMinBaSoTest {
    public TimMinBaSo timMinBaSo = new TimMinBaSo();

    @Test
    public void testWithValidNumber() {
        Assertions.assertEquals("2", timMinBaSo.minBaSo("4", "2", "8"));
    }

    @Test
    public void testWithNumberIsNull() {
        Assertions.assertThrows(NullPointerException.class, ()-> timMinBaSo.minBaSo("4", null, "8"));
    }

    @Test
    public void testWithNumberIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> timMinBaSo.minBaSo("4", "", "8"));
    }

    @Test
    public void testWithNumberIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, ()-> timMinBaSo.minBaSo("4asj", "2", "8"));
    }

    @Test
    public void testWithNumberMax(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> timMinBaSo.minBaSo("4", "1234", "8"));
    }
}