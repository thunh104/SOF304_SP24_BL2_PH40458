package com.example.de_thi_thu_03.Phan1;

public class KiemTraSoNguyenAm {
    public int kiemTra(){
        int[] list = {- 5, 6, -7, -9, 0, -1};
        for(int so : list){
            if(so < 0){
                return so;
            }
        }
        return 0;
    }
}
