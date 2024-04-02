import com.example.baitaplab4.entity.Item;
import com.example.baitaplab4.service.ItemService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ItemTest {

    @Test
    public void testAddPass() {
        ItemService itemService = new ItemService();
        itemService.addItem(new Item(1, "HoaiThu"));
        Assertions.assertTrue(itemService.getItems().size() == 1);
    }

    @Test
    public void testAddFail() {
        try {
            ItemService itemService = new ItemService();
            itemService.addItem(new Item(2, ""));
            System.out.println("Add failed because name is empty");
        } catch (IllegalArgumentException e) {
            ItemService itemService = new ItemService();
            Assertions.assertTrue(itemService.getItems().size() == 1);
        }
    }

    @Test
    public void testAddFail1() {
        try {
            ItemService itemService = new ItemService();
            itemService.addItem(new Item(2, null));
            System.out.println("Add failed because name is null");
        } catch (IllegalArgumentException e) {
            ItemService itemService = new ItemService();
            Assertions.assertTrue(itemService.getItems().size() == 1);
        }
    }


    @Test
    public void testAddPass50() {
        ItemService itemService = new ItemService();
        itemService.addItem(new Item(3, "NguyenHoaiThuzbcdxyz"));
        Assertions.assertTrue(itemService.getItems().size() == 1);
    }

    @Test
    public void testAddFail50() {
        try {
            ItemService itemService = new ItemService();
            itemService.addItem(new Item(3, "NguyenHoaiThuzbcdxyzssjkdfhsuifhsfiushsdukfnsjkfshfusjdhfsujsf"));
            System.out.println("Add failed because name exceeds 50 characters");
        } catch (IllegalArgumentException e) {
            ItemService itemService = new ItemService();
            Assertions.assertTrue(itemService.getItems().size() == 1);
        }
    }

    @Test
    public void testUpdatePass() {
        ItemService itemService = new ItemService();
        itemService.addItem(new Item(1, "Xoai"));
        itemService.updateItem(1, "Chanh");
        Assertions.assertEquals("Chanh", itemService.getItems().get(0).getName());
    }

    @Test
    public void testUpdateFail() {
        ItemService itemService = new ItemService();
        itemService.addItem(new Item(1, "Xoai"));
        itemService.updateItem(1, "Chanh");
        Assertions.assertEquals("Xoai", itemService.getItems().get(0).getName());
    }

    @Test
    public void testUpdateFail1() {
        try {
            ItemService itemService = new ItemService();
            itemService.addItem(new Item(2, "Cam"));
            itemService.updateItem(2, null);
            System.out.println("Update failed because name is null");
        } catch (IllegalArgumentException e) {
            ItemService itemService = new ItemService();
            Assertions.assertEquals(null, itemService.getItems().get(0).getName());
        }
    }

    @Test
    public void testDelete(){
        ItemService itemService = new ItemService();
        Item item = new Item(1, "XoaiFarm");
        itemService.addItem(item);
        itemService.deleteItem(1);
        Assertions.assertFalse(itemService.getItems().contains(item));
    }

    @Test
    public void testDeleteFail() {
        try {
            ItemService itemService = new ItemService();
            Item item = new Item(1, "XoaiFarm");
            itemService.addItem(item);
            itemService.deleteItem(8);
            System.out.println("Delete failed because id does not exist");
        } catch (IllegalArgumentException e) {
            ItemService itemService = new ItemService();
            Item item = new Item(1, "XoaiFarm");
            itemService.addItem(item);
            Assertions.assertFalse(itemService.getItems().contains(item));
        }
    }
}
