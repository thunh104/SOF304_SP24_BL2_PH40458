package Phan1;

public class ThuongLuong {
    public String tienLuong(String soNamLamViec) {
        if (soNamLamViec.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong so nam");
        } else {
            try {
                if (soNamLamViec == null) {
                    throw new NullPointerException("So nam khong duoc null");
                }
                double soNam = Double.parseDouble(soNamLamViec);
                if (soNam < 3) {
                    return ("Thuong 3 trieu");
                } else if (soNam <= 6) {
                    return ("Thuong 10 trieu");
                } else if (soNam <= 10) {
                    return ("Thuong 20 trieu");
                } else {
                    return ("Thuong 40 trieu");
                }
            } catch (Exception e) {
                throw new NumberFormatException("So nam phai la so");
            }
        }
    }
}
