package StudentGrader;

import com.ph40458.baitaplab07.StudentGrader.StudentGrader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentGraderTest {
    @Test
    public void testGraderWithValidNumberF1() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("F", grader.xepLoai(0));
    }

    @Test
    public void testGraderWithValidNumberF2() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("F", grader.xepLoai(20));
    }

    @Test
    public void testGraderWithValidNumberF3() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("F", grader.xepLoai(40));
    }

    @Test
    public void testGraderWithValidNumberD1() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("D", grader.xepLoai(41));
    }

    @Test
    public void testGraderWithValidNumberD2() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("D", grader.xepLoai(50));
    }

    @Test
    public void testGraderWithValidNumberD3() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("D", grader.xepLoai(60));
    }

    @Test
    public void testGraderWithValidNumberC1() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("C", grader.xepLoai(61));
    }

    @Test
    public void testGraderWithValidNumberC2() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("C", grader.xepLoai(65));
    }

    @Test
    public void testGraderWithValidNumberC3() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("C", grader.xepLoai(70));
    }

    @Test
    public void testGraderWithValidNumberB1() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("B", grader.xepLoai(71));
    }

    @Test
    public void testGraderWithValidNumberB2() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("B", grader.xepLoai(75));
    }

    @Test
    public void testGraderWithValidNumberB3() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("B", grader.xepLoai(80));
    }

    @Test
    public void testGraderWithValidNumberA1() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("A", grader.xepLoai(81));
    }

    @Test
    public void testGraderWithValidNumberA2() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("A", grader.xepLoai(89));
    }

    @Test
    public void testGraderWithValidNumberA3() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertEquals("A", grader.xepLoai(100));
    }

    @Test
    public void testGraderWithInvalidNegativeNumber() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertThrows(IllegalArgumentException.class, () -> grader.xepLoai(-5));
    }

    @Test
    public void testGraderWithInvalidPositiveNumber() {
        StudentGrader grader = new StudentGrader();
        Assertions.assertThrows(IllegalArgumentException.class, () -> grader.xepLoai(233));
    }

}
