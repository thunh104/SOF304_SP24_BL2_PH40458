package Phan2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    public List<SinhVien> listsv = new ArrayList<>();

    public SinhVienService() {
        listsv.add(new SinhVien("SV01", "Hoai Thu", 19, 9.6, 5, "PTPM"));
        listsv.add(new SinhVien("SV02", "Thu Trang", 20, 9.5, 5, "PTPM"));
        listsv.add(new SinhVien("SV03", "Thuy Tien", 18, 9.4, 2, "UDPM"));
        listsv.add(new SinhVien("SV04", "Hong Ngoc", 20, 9.2, 3, "XLDL"));
        listsv.add(new SinhVien("SV05", "Minh Huong", 19, 9.3, 4, "UDPM"));
    }

    public List<SinhVien> getAll() {
        return listsv;
    }

    public void addSV(SinhVien sinhVien) {
        if (String.valueOf(sinhVien.getTuoi()).trim().isEmpty()) {
            throw new IllegalArgumentException("Khong bo trong tuoi sinh vien");
        }
        if (sinhVien.getMaSV().trim().isEmpty() || sinhVien.getChuyenNganh().trim().isEmpty() || String.valueOf(sinhVien.getKiHoc()).trim().isEmpty() || String.valueOf(sinhVien.getDiemTB()).trim().isEmpty() || sinhVien.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Khong duoc bo trong du lieu");
        } else {
            for (SinhVien sv : listsv) {
                if (sinhVien.getMaSV() == null || sinhVien.getChuyenNganh() == null || sinhVien.getTen() == null) {
                    throw new NullPointerException("Khong duoc dien null");
                } else if (sinhVien.getTuoi() <= 17 || sinhVien.getTuoi() >= 120) {
                    throw new IllegalArgumentException("Tuoi sinh vien ngoai vung hop le (17-120)");
                } else if (sv.getMaSV().equalsIgnoreCase(sinhVien.getMaSV())) {
                    throw new IllegalArgumentException("Ma SV da ton tai");
                }
            }
        }
        listsv.add(sinhVien);
    }
}
