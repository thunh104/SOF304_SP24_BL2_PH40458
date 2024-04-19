package Phan2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    public List<NhanVien> nhanVienList = new ArrayList<>();

    public NhanVienService() {
        nhanVienList.add(new NhanVien(1, "NV01", "Nguyen", "Thu", "Nhan vien", 120000));
        nhanVienList.add(new NhanVien(2, "NV02", "Hoai", "Thu", "Nhan vien", 120000));
        nhanVienList.add(new NhanVien(3, "NV03", "Nguyen", "Thu", "Nhan vien", 120000));
        nhanVienList.add(new NhanVien(4, "NV04", "Hoai", "Thu", "Nhan vien", 120000));
        nhanVienList.add(new NhanVien(5, "NV05", "Nguyen", "Thu", "Nhan vien", 120000));
    }

    public List<NhanVien> getAll() {
        return nhanVienList;
    }

    public void addNV(NhanVien nhanVien) {
        if (String.valueOf(nhanVien.getEmployeeID()).trim().isEmpty() || nhanVien.getCodeEmployee().trim().isEmpty() || nhanVien.getFirstName().trim().isEmpty() || nhanVien.getFirstName().trim().isEmpty() || nhanVien.getPosition().trim().isEmpty() || String.valueOf(nhanVien.getSalary()).trim().isEmpty()) {
            throw new IllegalArgumentException("Khong bo trong truong du lieu");
        } else if (nhanVien.getPosition() == null || nhanVien.getFirstName() == null || nhanVien.getLastName() == null || nhanVien.getCodeEmployee() == null) {
            throw new NullPointerException("Khong duoc dien gia tri null");
        } else if (!nhanVien.getFirstName().matches("[a-zA-Z0-9]+") || !nhanVien.getLastName().matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Khong duoc dien ten chua ki tu dac biet");
        } else if (nhanVien.getSalary() < 20000 || nhanVien.getSalary() >= 10000000) {
            throw new IllegalArgumentException("Tien luong khong hop le");
        } else {
            nhanVienList.add(nhanVien);
        }
    }

    public int searchByName(String firstName) {
        int count = 0;
        if (validate(firstName)) {
            for (NhanVien nv : nhanVienList) {
                if (nv.getFirstName().equalsIgnoreCase(firstName)) {
                    count++;
                }
            }
            if (count == 0) {
                throw new ArrayIndexOutOfBoundsException("Khong co ten nay");
            } else {
                return count;
            }
        }
        return 0;
    }

    public boolean validate(String firstName) {
        if (firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Khong bo trong truong du lieu");
        } else if (firstName == null) {
            throw new NullPointerException("Khong duoc dien gia tri null");
        } else if (!firstName.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Khong duoc dien ten chua ki tu dac biet");
        }
        return true;
    }
}
