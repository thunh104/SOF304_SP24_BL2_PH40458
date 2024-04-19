package Phan2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class GiaoVienService {
    private List<GiaoVien> giaoVienList = new ArrayList<>();

    public GiaoVienService() {
        giaoVienList.add(new GiaoVien(1, "GV01", "Thu", new Date(2004, 10, 22), "Ha Noi", 3));
        giaoVienList.add(new GiaoVien(2, "GV02", "Trang", new Date(2004, 4, 29), "Ha Noi", 4));
        giaoVienList.add(new GiaoVien(3, "GV03", "Thu", new Date(2004, 7, 12), "Ha Noi", 5));
        giaoVienList.add(new GiaoVien(4, "GV04", "Ngoc", new Date(2004, 5, 23), "Ha Noi", 6));
    }

    public List<GiaoVien> getAll() {
        return giaoVienList;
    }

    public int searchByName(String ten) {
        int count = 0;
        if (validate(ten)) {
            if (ten == null) {
                throw new NullPointerException("Ten khong duoc null");
            }
            for (GiaoVien gv : giaoVienList) {
                if (gv.getTenGV().equalsIgnoreCase(ten)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean validate(String ten) {
        if (ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc bo trong");
        } else if (!ten.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Ten khong duoc chua ki tu dac biet");
        }
        return true;
    }

    public void addGV(GiaoVien giaoVien) {
        if (giaoVien.getTenGV().trim().isEmpty() || giaoVien.getDiaChi().trim().isEmpty() || giaoVien.getMaGV().trim().isEmpty() || String.valueOf(giaoVien.getId()).trim().isEmpty() || String.valueOf(giaoVien.getSoNamKinhNghiem()).trim().isEmpty()) {
            throw new IllegalArgumentException("khong duoc bo trong");
        } else if (giaoVien.getTenGV() == null || giaoVien.getDiaChi() == null || giaoVien.getMaGV() == null){
            throw new NullPointerException("Khong duoc null");
        } else if(!giaoVien.getMaGV().startsWith("GV")){
            throw new IllegalArgumentException("Ma gv phai bat dau bang GV");
        } else if(giaoVien.getSoNamKinhNghiem() < 0 || giaoVien.getSoNamKinhNghiem() > 60){
            throw new IllegalArgumentException("Ngoai vung hop le");
        } else {
            giaoVienList.add(giaoVien);
        }
    }
}
