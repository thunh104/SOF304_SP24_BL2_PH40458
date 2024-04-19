package com.example.de_thi_thu_03.Phan2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    public List<NhanVien> nhanVienList = new ArrayList<>();

    public NhanVienService() {
        nhanVienList.add(new NhanVien("NV01", "Hoai Thu", "thu@gmail.com", "Ha Noi 1", "Nhan vien", 20000));
        nhanVienList.add(new NhanVien("NV02", "Hoai Trang", "trang@gmail.com", "Ha Noi 2", "Truong phong", 20000));
        nhanVienList.add(new NhanVien("NV03", "Hoai Nhung", "nhung@gmail.com", "Ha Noi 3", "Nhan vien", 20000));
        nhanVienList.add(new NhanVien("NV04", "Hoai Huong", "huong@gmail.com", "Ha Noi 4", "Truong phong", 20000));
        nhanVienList.add(new NhanVien("NV05", "Hoai Khanh", "khanh@gmail.com", "Ha Noi 5", "Truong phong", 20000));
    }

    public List<NhanVien> getAll(){
        return nhanVienList;
    }

    public void deleteNV(NhanVien nhanVien){
        nhanVienList.remove(nhanVien);
    }
}
