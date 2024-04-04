package com.example.LuyenTap.PhepTinh;

public class TinhHieu {
    public String TinhHieu(String a, String b){
        try {
            if(a.trim().isEmpty()||b.trim().isEmpty()) {
                return "Giá trị nhập vào không được để trống";
            }else {
                int numa = Integer.parseInt(a);
                int numb = Integer.parseInt(b);
                return String.valueOf(numa - numb);
            }
        }catch (Exception e){
            throw new NumberFormatException("Giá trị nhập vào phải là số");
        }
    }
}
