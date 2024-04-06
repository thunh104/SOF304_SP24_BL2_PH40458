package com.example.bai_tap_lab_08.bai3;

public class StringManipulator {
    public String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Chuỗi null");
        }
        return str1 + str2;
    }
}
