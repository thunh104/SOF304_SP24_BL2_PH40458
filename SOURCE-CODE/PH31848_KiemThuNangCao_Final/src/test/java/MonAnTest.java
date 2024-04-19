import org.junit.Before;
import org.junit.Test;
import org.ph31848.MonAn;
import org.ph31848.MonAnService;

import java.util.List;

import static org.junit.Assert.*;

public class MonAnTest {

    private MonAnService service;
    private List<MonAn> list;

    @Before
    public void setup() {
        service = new MonAnService();
        list = service.getList();
    }

    @Test
    public void delete1() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        MonAn monAn2 = new MonAn("ma2", "ten2", 5.1, 1);
        MonAn monAn3 = new MonAn("ma3", "ten3", 7.2, 1);
        list.add(monAn1);
        list.add(monAn2);
        list.add(monAn3);

        assertTrue(service.delete(monAn1)); // delete phan tu o dau
    }

    @Test
    public void delete2() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        MonAn monAn2 = new MonAn("ma2", "ten2", 5.1, 1);
        MonAn monAn3 = new MonAn("ma3", "ten3", 7.2, 1);
        list.add(monAn1);
        list.add(monAn2);
        list.add(monAn3);

        assertTrue(service.delete(monAn2)); // delete phan tu o giua
    }

    @Test
    public void delete3() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        MonAn monAn2 = new MonAn("ma2", "ten2", 5.1, 1);
        MonAn monAn3 = new MonAn("ma3", "ten3", 7.2, 1);

        list.add(monAn1);
        list.add(monAn2);
        list.add(monAn3);

        assertTrue(service.delete(monAn3)); // delete phan tu o cuoi
    }

    @Test
    public void delete4() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        MonAn monAn2 = new MonAn("ma2", "ten2", 5.1, 1);
        MonAn monAn3 = new MonAn("ma3", "ten3", 7.2, 1);
        MonAn monAn4 = new MonAn("ma4", "ten4", 9.5, 0);

        list.add(monAn1);
        list.add(monAn2);
        list.add(monAn3);

        assertFalse(service.delete(monAn4)); // delete phan tu khong co trong list
    }

    @Test(expected = IllegalArgumentException.class)
    public void delete5() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        MonAn monAn2 = new MonAn("ma2", "ten2", 5.1, 1);
        MonAn monAn3 = new MonAn("ma3", "ten3", 7.2, 1);
        MonAn monAn4 = null;

        list.add(monAn1);
        list.add(monAn2);
        list.add(monAn3);
        list.add(monAn4);

        assertFalse(service.delete(monAn4)); // delete phan tu null
    }

    @Test(expected = IllegalArgumentException.class)
    public void delete6() {
        list = null;
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        service.delete(monAn1); // list la null
    }

    @Test(expected = IllegalArgumentException.class)
    public void delete7() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        service.delete(monAn1); // list khong co phan tu nao
    }

    @Test
    public void delete8() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);
        list.add(monAn1);
        assertTrue(service.delete(monAn1)); // list co duy nhat mot phan tu
    }

    @Test(expected = IllegalArgumentException.class)
    public void delete9() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 2);
        list.add(monAn1);
        assertTrue(service.delete(monAn1)); // trang thai khong hop le
    }

    @Test(expected = IllegalArgumentException.class)
    public void delete10() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, -1);
        list.add(monAn1);
        assertTrue(service.delete(monAn1)); // trang thai khong hop le
    }

    @Test
    public void delete11() {
        MonAn monAn1 = new MonAn("ma1", "ten1", 3.4, 0);

        MonAn monAn2 = new MonAn();
        monAn2.setMa(monAn1.getMa());
        monAn2.setTen(monAn1.getTen());
        monAn2.setGia(monAn1.getGia());
        monAn2.setTrangThai(monAn1.getTrangThai());

        list.add(monAn1);

        assertFalse(service.delete(monAn2)); // clone gia tri monAn1 sang monAn2
    }

}
