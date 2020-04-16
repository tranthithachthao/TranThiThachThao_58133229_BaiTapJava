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
public class SinhVienBiz extends SinhVienPoly{
    double diemMaketing;
    double diemSales;

    public SinhVienBiz(double diemMaketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMaketing = diemMaketing;
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (diemMaketing * 2 + diemSales)/3;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("diem Maketing: " + diemMaketing + "\n"
                + "diem Sales: " + diemSales +"\n"
                + "DiemTB: " + getDiem() + "\n"
                + "Hoc Luc: " + getHocLuc() + "\n");
    }
    
}
