package com.example.bai_tap_lab7.SinhVien;

public class SinhVien {
    private String id;
    private String hoTen;
    private int lop;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String id, String hoTen, int lop, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
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

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
