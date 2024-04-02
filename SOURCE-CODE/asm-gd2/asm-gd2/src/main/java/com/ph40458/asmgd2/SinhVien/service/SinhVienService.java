package com.ph40458.asmgd2.SinhVien.service;

import com.ph40458.asmgd2.SinhVien.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public SinhVienService() {
        sinhVienList.add(new SinhVien("2", "Xoai", "HG01", "Hoa Qua", "SV01"));
        sinhVienList.add(new SinhVien("3", "Chanh", "HG02", "Trai Cay", "SV02"));
        sinhVienList.add(new SinhVien("4", "Cam", "HG03", "Vegetables", "SV03"));
        sinhVienList.add(new SinhVien("5", "Man", "HG02", "Hoa Qua", "SV04"));
        sinhVienList.add(new SinhVien("6", "Oi", "HG03", "Vegetables", "SV05"));
    }

    public List<SinhVien> getSinhVien() {
        return sinhVienList;
    }

    public void addSinhVien(SinhVien sinhVien) {
        if (checkNameClass(sinhVien.getTenLop())) {
            sinhVienList.add(sinhVien);
        } else {
            System.out.println("Class name is invalid");
        }
    }

    public List<SinhVien> searchByName(String ten) {
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien sv : sinhVienList) {
            if (sv.getHoTen().equalsIgnoreCase(ten)) {
                result.add(sv);
            }
        }
        return result;
    }

    public boolean checkNameClass(String tenLop) {
        return tenLop.matches("[a-zA-Z0-9]{3,15}");
    }

    public List<SinhVien> searchByIdClass(String maLop) {
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaLop().equalsIgnoreCase(maLop)) {
                result.add(sv);
            } else {
                System.out.println("This class code could not be found");
            }
        }
        return result;
    }

    public SinhVien searchByIdStudent(String masv) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getMasv().equalsIgnoreCase(masv)) {
                return sv;
            } else {
                System.out.println("This student code could not be found");
            }
        }
        return null;
    }
}
