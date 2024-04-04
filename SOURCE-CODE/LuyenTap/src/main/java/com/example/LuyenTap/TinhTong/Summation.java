package com.example.LuyenTap.TinhTong;

public class Summation {
    public int sum(int n){
        if(n < 0){
            throw new ArithmeticException(("n không phải là số nguyên âm"));
        }else {
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            return sum;
        }



    }
}
