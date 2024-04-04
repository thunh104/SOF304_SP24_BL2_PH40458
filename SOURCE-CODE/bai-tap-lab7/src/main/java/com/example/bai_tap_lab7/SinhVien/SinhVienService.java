package com.example.bai_tap_lab7.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public SinhVienService() {
        sinhVienList.add(new SinhVien("1", "Xoai", 1, "xoai@gmail.com"));
        sinhVienList.add(new SinhVien("2", "Cam", 2, "cam@gmail.com"));
        sinhVienList.add(new SinhVien("3", "Man", 3, "man@gmail.com"));
        sinhVienList.add(new SinhVien("4", "Dao", 4, "dao@gmail.com"));
    }

    public List<SinhVien> getSinhVien() {
        return sinhVienList;
    }

    public void addSinhVien(SinhVien sinhVien) {
        if (sinhVien.getId().isEmpty() || sinhVien.getEmail().isEmpty() || sinhVien.getHoTen().isEmpty() || String.valueOf(sinhVien.getLop()).isEmpty()) {
            throw new IllegalArgumentException("Không bỏ trống trường dữ liệu !");
        } else if (sinhVien.getId() == null || sinhVien.getEmail() == null || sinhVien.getHoTen() == null || String.valueOf(sinhVien.getLop()) == null) {
            throw new NullPointerException("Không điền giá trị null !");
        } else if (sinhVien.getLop() <= 0 || sinhVien.getLop() >= 2147483647) {
            System.out.println("Ngoài vùng hợp lệ !");
        } else {
            sinhVienList.add(sinhVien);
        }
    }

    public void removeSinhVien(String id) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getId().equals(id)) {
                sinhVienList.remove(sv);
                break;
            }
        }
    }
}
