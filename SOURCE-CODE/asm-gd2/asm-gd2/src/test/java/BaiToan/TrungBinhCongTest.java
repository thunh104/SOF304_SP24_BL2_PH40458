package BaiToan;

import com.ph40458.asmgd2.BaiToan.TrungBinhCong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrungBinhCongTest {
    @Test()
    public void testTinhTrungBinhCong_DanhSachTrong() {
        List<Integer> listTrong = new ArrayList<>();
        TrungBinhCong trungBinhCong = new TrungBinhCong();
        Assertions.assertThrows(ArithmeticException.class, () -> trungBinhCong.TrungBinhCong(listTrong));
    }

    @Test
    public void testTBC() {
        TrungBinhCong trungBinhCong = new TrungBinhCong();
        List<Integer> lists = Arrays.asList(22, 29, 10, 4);
        double kq = trungBinhCong.TrungBinhCong(lists);
        Assertions.assertEquals(16.25, kq, 0.001);
    }

    @Test
    public void testAverage() {
        TrungBinhCong trungBinhCong = new TrungBinhCong();
        List<Integer> lists = Arrays.asList(20, 30, 10, -4);
        double kq = trungBinhCong.TrungBinhCong(lists);
        Assertions.assertEquals(18, kq, 0.001);
    }
}
