package com.example.de_thi_thu_02;

public class TimMaxBaSo {
    public String MaxBaSo(String soA, String soB, String soC) {
        if (soA.trim().isEmpty() || soB.trim().isEmpty() || soC.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong so a, b, c");
        } else {
            try {
                int a = Integer.parseInt(soA);
                int b = Integer.parseInt(soB);
                int c = Integer.parseInt(soC);
                if (a <= 0 || a > 100 || b <= 0 || b > 100 || c <= 0 || c > 100) {
                    throw new IllegalArgumentException("Ngoai vung hop le");
                } else {
                    if (a > b) {
                        return String.valueOf(a);
                    } else if (b > c) {
                        return String.valueOf(b);
                    } else {
                        return String.valueOf(c);
                    }
                }
            } catch (Exception e) {
                throw new NumberFormatException("Phai nhap vao la so");
            }
        }
    }
}
