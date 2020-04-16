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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (diemJava * 2 + diemCss + diemHtml )/4;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("diem Java: " + diemJava + "\n"
                + "diem Css: " + diemCss + "\n"
                + "diem Html: " + diemHtml + "\n"
                + "DiemTB: " + getDiem() + "\n"
                + "Hoc Luc: " + getHocLuc() + "\n");
    }
    
}

