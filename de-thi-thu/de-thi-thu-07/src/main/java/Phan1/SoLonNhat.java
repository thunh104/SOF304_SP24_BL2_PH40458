package Phan1;

public class SoLonNhat {
    public int findMax(String soa, String sob, String soc) {
        if (soa.trim().isEmpty() || sob.trim().isEmpty() || sob.trim().isEmpty()) {
            throw new IllegalArgumentException("So khong duoc trong");
        } else {
            try {
                if (soa == null || sob == null || soc == null) {
                    throw new NullPointerException("So khong null");
                }
                int a = Integer.parseInt(soa);
                int b = Integer.parseInt(sob);
                int c = Integer.parseInt(soc);
                if (a < 0 || b < 0 || c < 0) {
                    throw new IllegalArgumentException("So phai < 0");
                }
                if (a == b) {
                    return 0;
                } else if (b == c) {
                    return 0;
                } else if (a > b) {
                    return a;
                } else if (b > c) {
                    return b;
                } else {
                    return c;
                }
            } catch (Exception e) {
                throw new NumberFormatException("Phai nhap vao la so");
            }
        }
    }
}
