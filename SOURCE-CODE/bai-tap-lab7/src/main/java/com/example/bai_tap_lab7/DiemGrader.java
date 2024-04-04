package com.example.bai_tap_lab7;

public class DiemGrader {
    public static String xepLoai(int score) {
        if (score >= 0 && score <= 40) {
            return "F";
        } else if (score >= 41 && score <= 70) {
            return "B";
        } else if (score >= 71 && score <= 100) {
            return "A";
        } else {
            throw new IllegalArgumentException("Điểm số không hợp lệ");
        }
    }
}
