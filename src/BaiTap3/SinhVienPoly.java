/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Dell
 */
public abstract class SinhVienPoly {
        String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc()
    {
        double n = getDiem();
        String m ="";
        if (n < 5)
            m = "Yếu";
        if( 5 <= n && n <6.5)
            m = "Trung Bình";
        if(6.5 <= n && n < 7.5)
            m = "Khá";
        if(7.5 <= n && n < 9)
           m = "Giỏi";
        if(n >= 9)
           m = "Xuất xắc";
        return m;
    }
    public void xuat()
    {
        System.out.println("Ho Ten:" + hoTen + "\n"
                + "Nganh: " + nganh + "\n");
    }
    
}
