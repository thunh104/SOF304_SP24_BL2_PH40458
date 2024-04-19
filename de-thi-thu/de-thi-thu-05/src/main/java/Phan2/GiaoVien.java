package Phan2;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GiaoVien {
    private int id;
    private String maGV;
    private String tenGV;
    private Date ngaySinh;
    private String diaChi;
    private int soNamKinhNghiem;
}
