package Phan1;

public class TinhGiaiThua {
    public int giaiThua(String soN) {
        if (soN.trim().isEmpty()) {
            throw new IllegalArgumentException("n khong duoc bo trong");
        } else {
            try {
                if (soN == null) {
                    throw new NullPointerException("n khong duoc null");
                }
                int tich = 1;
                int n = Integer.parseInt(soN);
                if (n < 0) {
                    throw new IllegalArgumentException("n phai > 0");
                }
                if (n == 0 || n == 1) {
                    return 1;
                }
                for (int i = 2; i <= n; i++) {
                    tich *= i;
                }
                return tich;
            } catch (Exception e) {
                throw new NumberFormatException("n phai la so");
            }
        }
    }
}
