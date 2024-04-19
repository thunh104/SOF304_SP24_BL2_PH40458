package com.example.de_thi_thu_02;

public class Tong1NSoLe {
    public int tinhTongN(String soN) {
        if (soN.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong so n");
        } else {
            try {
                if (soN == null) {
                    throw new NullPointerException("Khong duoc nhap gia tri null");
                }
                int n = Integer.parseInt(soN);
                if (n < 0 || n >= 1000) {
                    throw new IllegalArgumentException("Ngoai vung 0-1000");
                }
                int tong = 0;
                for (int i = 0; i <= n; i++) {
                    if (i % 3 == 0 && i % 5 == 0 && i != 15) {
                        tong += i;
                    }
                }
                return tong;
            } catch (Exception e) {
                throw new NumberFormatException("n phai la so");
            }
        }
    }
}
