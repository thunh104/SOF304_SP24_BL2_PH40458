package bai3;

import com.example.bai_tap_lab_08.bai3.StringManipulator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    @Test
    public void testPass() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.concatenate("abc", "xyz");
        Assertions.assertEquals("abcxyz", result);
    }

    @Test
    public void testWithString1IsNull() {
        StringManipulator manipulator = new StringManipulator();
        Assertions.assertThrows(NullPointerException.class, () -> { manipulator.concatenate(null, "World"); });
    }

    @Test
    public void testWithString2IsNull() {
        StringManipulator manipulator = new StringManipulator();
        Assertions.assertThrows(NullPointerException.class, () -> { manipulator.concatenate("Hello", null); });
    }

    @Test
    public void testFail() {
        StringManipulator manipulator = new StringManipulator();
        Assertions.assertThrows(NullPointerException.class, () -> { manipulator.concatenate(null, null); });
    }
}
