package com.ph40458.baitaplab07.BaiHat.service;

import com.ph40458.baitaplab07.BaiHat.entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> baiHatList = new ArrayList<>();

    public BaiHatService() {
        baiHatList.add(new BaiHat("1", "abc", "Noo Phuoc Thinh", 10, "Trinh Cong Son"));
        baiHatList.add(new BaiHat("2", "aaa", "Noo Phuoc Thinh", 20, "Trinh Cong Son"));
        baiHatList.add(new BaiHat("3", "mns", "Noo Phuoc Thinh", 30, "Trinh Cong Son"));
        baiHatList.add(new BaiHat("4", "xyz", "Noo Phuoc Thinh", 40, "Trinh Cong Son"));
    }

    public List<BaiHat> getBaiHat() {
        return baiHatList;
    }

    public void addBH(BaiHat baiHat) {
        if (baiHat.getId().isEmpty() || baiHat.getTen().isEmpty() || baiHat.getTenNhacSi().isEmpty() || baiHat.getTenCaSi().isEmpty() || String.valueOf(baiHat.getDoDai()).isEmpty()) {
            throw new IllegalArgumentException("Không bỏ trống trường dữ liệu !");
        } else if (baiHat.getId() == null || baiHat.getTen() == null || baiHat.getTenNhacSi() == null || baiHat.getTenCaSi() == null || String.valueOf(baiHat.getDoDai()) == null) {
            throw new NullPointerException("Không điền giá trị null !");
        } else if (baiHat.getDoDai() <= 0 || baiHat.getDoDai() >= 2147483647) {
            System.out.println("Độ dài phải là số nguyên dương > 0 và < 2147483647!");
        } else {
            baiHatList.add(baiHat);
        }
    }

    public void removeBH(String id) {
        for (BaiHat bh : baiHatList) {
            if (bh.getId().equals(id)) {
                baiHatList.remove(bh);
                break;
            }
        }
    }
}
