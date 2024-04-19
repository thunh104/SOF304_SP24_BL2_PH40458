package Phan1;

public class TongCacSo {
    public int tinhTong(String soN) {
        if (soN.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong n");
        } else {
            try {
                if (soN == null) {
                    throw new NullPointerException("n khong duoc null");
                }
                int sum = 0;
                int n = Integer.parseInt(soN);
                if (n < 0) {
                    throw new IllegalArgumentException("n phai > 0");
                }
                for (int i = 0; i <= n; i++) {
                    if (i % 3 == 0 && i % 5 == 0 & i != 15) {
                        sum += i;
                    }
                }
                return sum;
            } catch (Exception e) {
                throw new NumberFormatException("n phai la so");
            }
        }
    }
}
