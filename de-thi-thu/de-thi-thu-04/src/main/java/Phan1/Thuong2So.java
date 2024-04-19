package Phan1;

public class Thuong2So {
    public double thuong(String soa, String sob) {
        if (soa.trim().isEmpty() || sob.trim().isEmpty()) {
            throw new IllegalArgumentException("So khong duoc bo trong");
        } else {
            try {
                if (soa == null || sob == null) {
                    throw new NullPointerException("Khong duoc nhap null");
                }
                double a = Double.parseDouble(soa);
                double b = Double.parseDouble(sob);
                if (b == 0) {
                    return 0;
                }
                return a / b;
            } catch (Exception e) {
                throw new NumberFormatException("Nhap vao phai la so");
            }
        }
    }
}
