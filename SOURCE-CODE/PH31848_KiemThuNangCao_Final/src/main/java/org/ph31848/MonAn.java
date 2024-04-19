package org.ph31848;

public class MonAn {

    private String ma;
    private String ten;
    private Double gia;
    private Integer trangThai;

    public MonAn() {
    }

    public MonAn(String ma, String ten, Double gia, Integer trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", trangThai=" + trangThai +
                '}';
    }
}
