package Phan2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public SinhVienService() {
        sinhVienList.add(new SinhVien("SV01", "Thu", "Nu", 2004, "UDPM"));
        sinhVienList.add(new SinhVien("SV02", "Trang", "Nam", 2004, "XLDL"));
        sinhVienList.add(new SinhVien("SV03", "Thu", "Nam", 2004, "PTPM"));
        sinhVienList.add(new SinhVien("SV04", "Trang", "Nu", 2004, "UDPM"));
        sinhVienList.add(new SinhVien("SV05", "Thu", "Nu", 2004, "UDPM"));
    }

    public List<SinhVien> getAll() {
        return sinhVienList;
    }

    public String addSV(SinhVien sinhVien) {
        if (sinhVien.getMaSV().trim().isEmpty() || sinhVien.getTenSV().trim().isEmpty() || sinhVien.getChuyenNganh().trim().isEmpty() || sinhVien.getGioiTinh().trim().isEmpty() || String.valueOf(sinhVien.getNamSinh()).trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong du lieu");
        } else if (sinhVien.getGioiTinh() == null || sinhVien.getTenSV() == null || sinhVien.getChuyenNganh() == null || sinhVien.getMaSV() == null) {
            throw new NullPointerException("Khong duoc null");
        } else if (sinhVien.getNamSinh() > 2007 || sinhVien.getNamSinh() < 1994) {
            throw new IllegalArgumentException("Ngoai vung hop le");
        } else {
            for (SinhVien sv : sinhVienList) {
                if (sv.getMaSV().equalsIgnoreCase(sinhVien.getMaSV())) {
                    throw new IllegalArgumentException("Da ton tai ma sv nay");
                } else {
                    sinhVienList.add(sinhVien);
                    return "Add thanh cong";
                }
            }
            return null;
        }
    }

    public String updateSV(SinhVien sinhVien) {
        if (sinhVien.getMaSV().trim().isEmpty() || sinhVien.getTenSV().trim().isEmpty() || sinhVien.getChuyenNganh().trim().isEmpty() || sinhVien.getGioiTinh().trim().isEmpty() || String.valueOf(sinhVien.getNamSinh()).trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong du lieu");
        } else if (sinhVien.getGioiTinh() == null || sinhVien.getTenSV() == null || sinhVien.getChuyenNganh() == null || sinhVien.getMaSV() == null) {
            throw new NullPointerException("Khong duoc null");
        } else if (sinhVien.getNamSinh() > 2007 || sinhVien.getNamSinh() < 1994) {
            throw new IllegalArgumentException("Ngoai vung hop le");
        } else {
            for (SinhVien sv : sinhVienList) {
                if (!sv.getMaSV().equalsIgnoreCase(sinhVien.getMaSV())) {
                    throw new IllegalArgumentException("Ma SV khong ton tai");
                } else {
                    sv.setTenSV(sinhVien.getTenSV());
                    sv.setChuyenNganh(sinhVien.getChuyenNganh());
                    sv.setNamSinh(sinhVien.getNamSinh());
                    sv.setGioiTinh(sinhVien.getGioiTinh());
                    return "Update thanh cong";
                }
            }
        }
        return null;
    }
}
