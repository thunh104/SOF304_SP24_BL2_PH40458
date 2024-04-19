package com.example.de_thi_thu_03.Phan2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NhanVien {
    private String maNV;
    private String ten;
    private String email;
    private String diaChi;
    private String chucVu;
    private int tienLuong;
}
