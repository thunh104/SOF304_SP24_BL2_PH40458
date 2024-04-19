package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoLonNhatTest {
    public SoLonNhat soLonNhat = new SoLonNhat();

    @Test
    public void testPass() {
        Assertions.assertEquals(8, soLonNhat.findMax("3", "5", "8"));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> soLonNhat.findMax(null, "5", "8"));
    }

    @Test
    public void testEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> soLonNhat.findMax("3", "", "8"));
    }

    @Test
    public void testNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> soLonNhat.findMax("3", "-5", "8"));
    }

    @Test
    public void testCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> soLonNhat.findMax("3", "abc", "8"));
    }

    @Test
    public void testEquals() {
        Assertions.assertEquals(0, soLonNhat.findMax("8", "8", "8"));
    }
}
