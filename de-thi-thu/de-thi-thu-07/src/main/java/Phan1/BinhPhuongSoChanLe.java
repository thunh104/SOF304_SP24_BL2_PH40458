package Phan1;

public class BinhPhuongSoChanLe {
    public String binhPhuong(String soN) {
        if (soN.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong");
        } else {
            try {
                if (soN == null) {
                    throw new NullPointerException("Khong duoc null");
                }
                int n = Integer.parseInt(soN);
                if(n < 0){
                    throw new IllegalArgumentException("n phai lon hon 0");
                }
                if ((n * n) % 2 == 0) {
                    return "So chan";
                } else {
                    return "So le";
                }
            } catch (Exception e) {
                throw new NumberFormatException("Khong dung dinh dang so");
            }
        }
    }
}
