package Phan1;

public class TrungBinhCong {
    public double tinhTBC(String diemToan, String diemLy, String diemHoa) {
        if (diemToan.trim().isEmpty() || diemLy.trim().isEmpty() || diemHoa.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong bo trong diem");
        } else {
            try {
                if (diemToan == null || diemLy == null || diemHoa == null) {
                    throw new NullPointerException("Khong dien gia tri null");
                }
                double toan = Double.parseDouble(diemToan);
                double ly = Double.parseDouble(diemLy);
                double hoa = Double.parseDouble(diemHoa);
                if (toan <= 0 || toan > 10 || ly <= 0 || ly > 10 || hoa <= 0 || hoa > 10) {
                    throw new IllegalArgumentException("Diem phai trong khoang (0-10)");
                }
                return ((toan + ly + hoa) / 3);
            } catch (Exception e) {
                throw new NumberFormatException("Diem phai la so");
            }
        }
    }
}
