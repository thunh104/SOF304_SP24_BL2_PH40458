package Phan2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String gioiTinh;
    private int namSinh;
    private String chuyenNganh;
}
