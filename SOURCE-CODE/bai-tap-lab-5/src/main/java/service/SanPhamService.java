package service;

import entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> sanPhamList = new ArrayList<>();

    public SanPhamService() {
        sanPhamList.add(new SanPham("1", "SP01", "Product Name 1", 100000, "Xanh", "25", 5));
        sanPhamList.add(new SanPham("2", "SP02", "Product Name 2", 100000, "Den", "30", 15));
        sanPhamList.add(new SanPham("3", "SP03", "Product Name 3", 100000, "Do", "35", 10));
    }

    public List<SanPham> getAll() {
        return sanPhamList;
    }

    public void addSanPham(SanPham sanPham) throws IllegalAccessException {
        if (sanPham.getSoLuong() > 0 && sanPham.getSoLuong() < 100) {
            sanPhamList.add(sanPham);
        } else {
            throw new IllegalAccessException("Số lượng phải > 0 và < 100");
        }
    }

    public void updateSanPham(String id, String maSP, String tenSP, double gia, String mauSac, String kichThuoc, int soLuong) {
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getId().equals(id)) {
                sanPham.setMaSP(maSP);
                sanPham.setTenSP(tenSP);
                sanPham.setGia(gia);
                sanPham.setMauSac(mauSac);
                sanPham.setKichThuoc(kichThuoc);
                sanPham.setSoLuong(soLuong);
                break;
            }
        }
    }
}
