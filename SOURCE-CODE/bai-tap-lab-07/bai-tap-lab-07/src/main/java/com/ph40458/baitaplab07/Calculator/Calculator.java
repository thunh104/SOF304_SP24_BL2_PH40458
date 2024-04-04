package com.ph40458.baitaplab07.Calculator;

public class Calculator {
    public double multiplication(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        return (double) a / b;
    }
}
