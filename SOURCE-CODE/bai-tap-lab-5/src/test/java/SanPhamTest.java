import entity.SanPham;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.SanPhamService;

import java.util.ArrayList;
import java.util.List;

public class SanPhamTest {
    private List<SanPham> sanPhamList = new ArrayList<>();
    private SanPhamService sanPhamService = new SanPhamService();

    @Test
    public void testAddSP() throws IllegalAccessException {
        SanPhamService sanPhamService = new SanPhamService();
        SanPham sanPham = new SanPham("1", "SP01", "Product Name", 100000, "Xanh", "25", 5);
        sanPhamService.addSanPham(sanPham);
        Assertions.assertEquals(4, sanPhamService.getAll().size());
    }

    @Test
    public void testAddSPFail() throws IllegalAccessException {
        SanPhamService sanPhamService = new SanPhamService();
        SanPham sanPham = new SanPham("6", "SP06", "Product Name 3", 200000, "Do", "36", 120);
        sanPhamService.addSanPham(sanPham);
        Assertions.assertEquals(5, sanPhamService.getAll().size());
    }

    @Test
    public void testUpdatePass() throws IllegalAccessException {
        sanPhamService.addSanPham(new SanPham("6", "SP06", "Product Name 3", 200000, "Do", "36", 20));
        sanPhamService.updateSanPham("6", "SP07", "Product Name 5", 200000, "Do", "50", 25);
        Assertions.assertEquals(25, sanPhamService.getAll().get(3).getSoLuong());
    }

    @Test
    public void testUpdateFail() throws IllegalAccessException {
        sanPhamService.addSanPham(new SanPham("6", "SP06", "Product Name 3", 200000, "Do", "36", 20));
        sanPhamService.updateSanPham("6", "SP07", "Product Name 5", 200000, "Do", "50", 25);
        Assertions.assertEquals("SP06", sanPhamService.getAll().get(3).getMaSP());
    }
}
