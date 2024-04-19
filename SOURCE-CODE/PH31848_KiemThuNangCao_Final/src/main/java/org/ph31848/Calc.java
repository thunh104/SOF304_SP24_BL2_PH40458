package org.ph31848;

public class Calc {

    public boolean kiemTraSoNguyen(Integer number) {
        if (number < 0) {
            return false;
        } else {
            return true;
        }
    }

    public  Integer tichSo(Integer n) {
        Integer result = 1;

        if (n == null) {
            throw new IllegalArgumentException();
        } else if (n < 1) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result *= i;
                }
            }
        }

        return result;
    }

}
