package com.ph40458.asmgd2.BaiToan;

public class Calculator {
    public int tinhTong(int a, int b) {
        return a + b;
    }

    public int tinhTich(int a, int b) {
        return a * b;
    }

    public int tinhHieu(int a, int b) {
        return a - b;
    }

    public boolean checkNumIsInteger(double number) {
        return (number == (int) number);
    }

    public boolean checkNumIsInteger(String intStr) {
        try {
            double number = Double.parseDouble(intStr);
            return checkNumIsInteger(number);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
