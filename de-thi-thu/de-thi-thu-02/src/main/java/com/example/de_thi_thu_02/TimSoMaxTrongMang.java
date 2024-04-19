package com.example.de_thi_thu_02;

public class TimSoMaxTrongMang {
    public int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Mang khong duoc rong");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
