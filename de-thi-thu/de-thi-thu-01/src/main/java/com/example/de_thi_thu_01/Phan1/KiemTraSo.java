package com.example.de_thi_thu_01.Phan1;

public class KiemTraSo {
    public boolean soNguyen(String soN) {
        if (soN.isEmpty()) {
            throw new IllegalArgumentException("Khong bo trong so");
        } else {
            try {
                int so = Integer.parseInt(soN);
                if (soN == null) {
                    throw new NullPointerException("Khong duoc nhap gia tri null");
                } else {
                    if (so < 0) {
                        System.out.println("n la so am");
                    } else if (so > 0) {
                        System.out.printf("n la so duong");
                    } else {
                        System.out.printf("0 la so nguyen khong am khong duong");
                    }
                }
            } catch (Exception e) {
                throw new NumberFormatException("Nhap vao phai la so");
            }
        }
        return true;
    }
}
