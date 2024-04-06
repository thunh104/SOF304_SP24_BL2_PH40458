package bai4;

import com.example.bai_tap_lab_08.bai4.Sach;
import com.example.bai_tap_lab_08.bai4.SachService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SachServiceTest {
    private Sach s = new Sach();
    private SachService service = new SachService();
    private List<Sach> lists = service.getAll();

    @Test
    public void testAddPass() {
        int expected = 6;
        Sach sach = new Sach("S05", "Sach 1", 35, "Tac gia 3", 3);
        service.addSach(sach);
        int actual = lists.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddWithNameIsSpecialCharacter() {
        Sach sach = new Sach("S05", "Sach 1", 35, "@&@^&", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addSach(sach));
    }

    @Test
    public void testAddWithTenTacGiaIsEmpty() {
        Sach sach = new Sach("S05", "Sach 1", 35, "", 3);
        Assertions.assertThrows(NullPointerException.class, () -> service.addSach(sach));
    }

    @Test
    public void testAddFailWithBookNameIsNull() {
        Sach sach = new Sach("S05", null, 35, "@&@^&", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addSach(sach));
    }

    @Test
    public void testAddWithIdIsEmpty() {
        Sach sach = new Sach("", "Sach 1", 35, "@&@^&", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.addSach(sach));
    }

    @Test
    public void testSearchNamePass() {
        int expected = 2;
        int actual = service.searchByName("Tac gia 1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchInvalidName() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> service.searchByName("Duong"));
    }

    @Test
    public void searchInvalidName1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.searchByName("#$"));
    }

    @Test
    public void searchInvalidNameCharacter() {
        Assertions.assertThrows(NullPointerException.class, () -> service.searchByName(""));
    }

    @Test
    public void searchInvalidNameCharacterIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> service.searchByName(null));
    }
}
