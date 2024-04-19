package com.example.de_thi_thu_03.Phan1;

public class Tong2SoChan {
    public int tongSoChan(String soA, String soB) {
        if (soA.trim().isEmpty() || soB.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong so");
        } else {
            try {
                int a = Integer.parseInt(soA);
                int b = Integer.parseInt(soB);
                int sum = 0;
                if (soA == null || soB == null) {
                    throw new NullPointerException("Khong duoc nhap gia tri null");
                } else if (a % 2 != 0 || b % 2 != 0) {
                    System.out.println("So nhap vao khong phai so chan");
                } else if (a % 2 == 0 && b % 2 == 0) {
                    return sum = a + b;
                }
            } catch (Exception e) {
                throw new NumberFormatException("Nhap vao phai la so");
            }
        }
        return 0;
    }
}
