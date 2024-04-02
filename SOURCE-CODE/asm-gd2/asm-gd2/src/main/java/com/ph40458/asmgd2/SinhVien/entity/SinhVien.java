package com.ph40458.asmgd2.SinhVien.entity;

public class SinhVien {
    private String id;
    private String hoTen;
    private String maLop;
    private String tenLop;
    private String masv;

    public SinhVien() {
    }

    public SinhVien(String id, String hoTen, String maLop, String tenLop, String masv) {
        this.id = id;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.masv = masv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String setTenLop(String tenLop) {
        this.tenLop = tenLop;
        return tenLop;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
}
