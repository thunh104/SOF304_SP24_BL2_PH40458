package Phan2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private double diemTB;
    private int kiHoc;
    private String chuyenNganh;
}
