import com.example.de_thi_thu_02.TimMaxBaSo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimMaxBaSoTest {
    private TimMaxBaSo timMaxBaSo = new TimMaxBaSo();

    @Test
    public void testWithNumberAIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> timMaxBaSo.MaxBaSo("", "1", "2"));
    }

    @Test
    public void testWithNumberBIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> timMaxBaSo.MaxBaSo("2", "abc", "2"));
    }

    @Test
    public void testWithNumberCIsInvalidMax() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> timMaxBaSo.MaxBaSo("2", "3", "102"));
    }

    @Test
    public void testWithNumberCIsInvalidMin() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> timMaxBaSo.MaxBaSo("0", "3", "102"));
    }

    @Test
    public void testPass() {
        Assertions.assertEquals("8", timMaxBaSo.MaxBaSo("1", "3", "8"));
    }
}
