package com.example.LuyenTap.TinhToan;

public class Calculator {
    public double divide(int a, int b){
        if( b == 0){
            throw new ArithmeticException("Không thể chia cho số 0!");
        }
        return (double) a/b;
    }
}
