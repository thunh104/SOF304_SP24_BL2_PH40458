package com.example.de_thi_thu_01.Phan2;

import java.util.ArrayList;
import java.util.List;

public class DongVatService {
    public List<DongVat> listdv = new ArrayList<>();

    public DongVatService() {
        listdv.add(new DongVat("DV01", "Meo", "Dong vat 4 chan", 20, "Tren bo", 12));
        listdv.add(new DongVat("DV02", "Cho", "Dong vat 4 chan", 13, "Tren bo", 15));
        listdv.add(new DongVat("DV03", "Ca", "Dong vat boi", 15, "Duoi nuoc", 19));
    }

    public List<DongVat> getAll() {
        return listdv;
    }

    public void addDV(DongVat dongVat) {
        if (dongVat.getMaDongVat().isEmpty() || String.valueOf(dongVat.getChieuCao()).isEmpty() || dongVat.getTen().isEmpty() || dongVat.getLoai().isEmpty() || String.valueOf(dongVat.getCanNang()).isEmpty()) {
            throw new IllegalArgumentException("Không để trống dữ liệu !");
        } else if (dongVat.getMaDongVat() == null || String.valueOf(dongVat.getChieuCao()) == null || dongVat.getTen() == null || dongVat.getLoai() == null || String.valueOf(dongVat.getCanNang()) == null) {
            throw new NullPointerException("Không điền giá trị null");
        } else if (dongVat.getChieuCao() <= 0 || dongVat.getChieuCao() > 100) {
            throw new IllegalArgumentException("Chiều cao phải là số dương (0-100)");
        } else if (dongVat.getCanNang() <= 0 || dongVat.getCanNang() > 100) {
            throw new IllegalArgumentException("Cân nặng phải là số dương (0-100)");
        } else {
            listdv.add(dongVat);
        }
    }

    public void deleteDV(String maDV) {
        for (DongVat dv : listdv) {
            if (dv.getMaDongVat().isEmpty()) {
                throw new IllegalArgumentException("Phải nhập mã động vật");
            } else if (dv.getMaDongVat() == null) {
                throw new NullPointerException(("Khong duoc de null"));
            } else if (!maDV.matches("[a-zA-Z0-9]+")) {
                throw new IllegalArgumentException("Khong duoc chua ki tu dac biet");
            } else {
                listdv.remove(maDV);
            }
        }
    }
}
