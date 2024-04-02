package com.example.baitaplab3;

import java.util.List;

public class TrungBinhCong {
    public static double TrungBinhCong(List<Integer> list) {
        if (list.isEmpty()) {
            throw new ArithmeticException("Danh sách không được bỏ trống");
        }
        int tong = 0;
        for (int so : list) {
            tong += so;
        }
        return (double) tong / list.size();
    }
}
