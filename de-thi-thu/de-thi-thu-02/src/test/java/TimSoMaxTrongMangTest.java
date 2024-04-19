import com.example.de_thi_thu_02.TimSoMaxTrongMang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimSoMaxTrongMangTest {
    public TimSoMaxTrongMang timSoMax = new TimSoMaxTrongMang();

    @Test
    public void testPass() {
        int[] array = {4, 5, 7, 12};
        Assertions.assertEquals(12, timSoMax.findMax(array));
    }

    @Test
    public void testFail() {
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> timSoMax.findMax(array));
    }
}
