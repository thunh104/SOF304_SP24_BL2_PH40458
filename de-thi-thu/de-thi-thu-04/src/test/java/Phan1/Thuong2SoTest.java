package Phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Thuong2SoTest {
    public Thuong2So thuong2So = new Thuong2So();

    @Test
    public void testPass() {
        Assertions.assertEquals(2, thuong2So.thuong("6", "3"));
    }

    @Test
    public void testNumberAIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> thuong2So.thuong(null, "3"));
    }

    @Test
    public void testNumberBIsZero() {
        Assertions.assertEquals(0, thuong2So.thuong("6", "0"));
    }

    @Test
    public void testNumberIsCharacter() {
        Assertions.assertThrows(NumberFormatException.class, () -> thuong2So.thuong("6", "abc"));
    }

    @Test
    public void testNumberIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> thuong2So.thuong("", "3"));
    }
}
