package com.example.de_thi_thu_01.Phan2;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DongVat {
    private String maDongVat;
    private String ten;
    private String loai;
    private double chieuCao;
    private String khuVucSong;
    private double canNang;
}
