package com.ph40458.asmgd2.BaiToan;

public class TruyXuatPhanTuMang {
    public static int truyXuat( int index) {
        int[] arr = {1, 2, 3, 4, 5};
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            System.out.println("Invalid number");
            return -1;
        }
    }
}
