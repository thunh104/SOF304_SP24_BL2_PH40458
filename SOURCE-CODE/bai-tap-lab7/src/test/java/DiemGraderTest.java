import com.example.bai_tap_lab7.DiemGrader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiemGraderTest {
    @Test
    public void testGraderWithValidNumberF1() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("F", grader.xepLoai(0));
    }

    @Test
    public void testGraderWithValidNumberF2() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("F", grader.xepLoai(20));
    }

    @Test
    public void testGraderWithValidNumberF3() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("F", grader.xepLoai(40));
    }

    @Test
    public void testGraderWithValidNumberB1() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("B", grader.xepLoai(41));
    }

    @Test
    public void testGraderWithValidNumberB2() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("B", grader.xepLoai(59));
    }

    @Test
    public void testGraderWithValidNumberB3() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("B", grader.xepLoai(70));
    }

    @Test
    public void testGraderWithValidNumberA1() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("A", grader.xepLoai(71));
    }

    @Test
    public void testGraderWithValidNumberA2() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("A", grader.xepLoai(89));
    }

    @Test
    public void testGraderWithValidNumberA3() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertEquals("A", grader.xepLoai(100));
    }

    @Test
    public void testGraderWithInvalidNegativeNumber() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertThrows(IllegalArgumentException.class, () -> grader.xepLoai(-5));
    }

    @Test
    public void testGraderWithInvalidPositiveNumber() {
        DiemGrader grader = new DiemGrader();
        Assertions.assertThrows(IllegalArgumentException.class, () -> grader.xepLoai(233));
    }
}
