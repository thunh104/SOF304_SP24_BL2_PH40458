package com.ph40458.asmgd2.BaiToan;

import java.util.List;

public class TrungBinhCong {
    public static double TrungBinhCong(List<Integer> list) {
        if (list.isEmpty()) {
            throw new ArithmeticException("Danh sách không được bỏ trống !");
        }
        int tong = 0;
        for (int so : list) {
            tong += so;
        }
        return (double) tong / list.size();
    }
}
