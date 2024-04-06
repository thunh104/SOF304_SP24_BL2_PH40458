package com.example.bai_tap_lab_08.bai4;

import java.util.ArrayList;
import java.util.List;

public class SachService {
    private List<Sach> sachList = new ArrayList<>();

    public SachService() {
        sachList.add(new Sach("S01", "Sach 1", 20, "Tac gia 1", 2));
        sachList.add(new Sach("S02", "Sach 1", 20, "Tac gia 3", 2));
        sachList.add(new Sach("S03", "Sach 1", 20, "Tac gia 2", 2));
        sachList.add(new Sach("S04", "Sach 1", 20, "Tac gia 1", 2));
        sachList.add(new Sach("S05", "Sach 1", 20, "Tac gia 2", 2));
    }

    public List<Sach> getAll() {
        return sachList;
    }

    public void addSach(Sach sach) {
        if (validate(sach.getTenTacGia())) {
            if (sach.getTen() == null || sach.getId() == null || String.valueOf(sach.getLamTaiBan()) == null || String.valueOf(sach.getSoTrang()) == null || sach.getTenTacGia() == null) {
                throw new IllegalArgumentException("Không được điền null trường dữ liệu");
            } else if (sach.getTen().isEmpty() || sach.getId().isEmpty() || String.valueOf(sach.getLamTaiBan()).isEmpty() || String.valueOf(sach.getSoTrang()).isEmpty() || sach.getTenTacGia().isEmpty()) {
                throw new NullPointerException("Không được bỏ trống trường dữ liệu");
            } else {
                sachList.add(sach);
            }
        }
    }

    public boolean validate(String tenTG) {
        if (tenTG.trim().isEmpty()) {
            throw new NullPointerException("Tên tác giả trống");
        } else {
            if (!tenTG.matches(".*[a-zA-Z0-9].*")) {
                throw new IllegalArgumentException("Tên tác giả chứa kí tự đặc biệt");
            }
        }
        return true;
    }

    public int searchByName(String tenTacGia) {
        int count = 0;
        if (validate(tenTacGia)) {
            for (Sach s : sachList) {
                if (s.getTenTacGia().equalsIgnoreCase(tenTacGia)) {
                    count++;
                }
            }
            if (count == 0) {
                throw new ArrayIndexOutOfBoundsException("Không có tên tác giả này trong ds!");
            } else {
                return count;
            }
        }
        return 0;
    }
}
