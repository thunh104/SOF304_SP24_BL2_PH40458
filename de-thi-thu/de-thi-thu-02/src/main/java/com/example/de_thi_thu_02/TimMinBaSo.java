package com.example.de_thi_thu_02;

public class TimMinBaSo {
    public String minBaSo(String soa, String sob, String soc) {
        if (soa.trim().isEmpty() || sob.trim().isEmpty() || soc.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong so");
        } else {
            try {
                if (soa == null || sob == null || soc == null) {
                    throw new NullPointerException("Khong duoc dien gia tri null");
                }
                int a = Integer.parseInt(soa);
                int b = Integer.parseInt(sob);
                int c = Integer.parseInt(soc);
                if (a <= 0 || a > 100 || b <= 0 || b > 100 || c <= 0 || c > 100) {
                    throw new IllegalArgumentException("Ngoai vung hop le");
                }
                if (a < b) {
                    return String.valueOf(a);
                } else if (b < c) {
                    return String.valueOf(b);
                } else {
                    return String.valueOf(c);
                }
            } catch (Exception e) {
                throw new NumberFormatException("Nhap vao phai la so");
            }
        }
    }
}
