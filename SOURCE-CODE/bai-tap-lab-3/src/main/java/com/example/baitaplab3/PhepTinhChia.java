package com.example.baitaplab3;

import java.util.Scanner;

public class PhepTinhChia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số bị chia: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số chia: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Không thể chia cho 0.");
        } else {
            int thuong = a / b;
            System.out.println("Kết quả của phép chia là: " + thuong);
        }
        int thuong = a / b;
        System.out.println("Kết quả của phép chia là: " + thuong);
    }
}
