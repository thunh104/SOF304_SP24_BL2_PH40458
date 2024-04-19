package com.example.de_thi_thu_01.Phan1;

public class KiemTraHocLuc {
    public boolean kiemTraHL(String diemString) {
        if (diemString.isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong diem");
        } else {
            try {
                double diem = Double.valueOf(diemString);
                if (diemString == null) {
                    throw new NullPointerException("Diem khong duoc nhap null");
                } else {
                    if (diem >= 9) {
                        System.out.println("Sinh vien xuat sac");
                    } else if (diem >= 8 && diem < 9) {
                        System.out.println("Sinh vien gioi");
                    } else if (diem >= 7 && diem < 8) {
                        System.out.println("Sinh vien kha");
                    } else if (diem >= 5 && diem < 7) {
                        System.out.println("Sinh vien trung binh");
                    } else {
                        System.out.println("Sinh vien yeu");
                    }
                }
            } catch (Exception e) {
                throw new NumberFormatException("Diem phai la so");
            }
        }
        return true;
    }
}
