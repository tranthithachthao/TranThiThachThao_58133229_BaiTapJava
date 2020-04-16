/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Dell
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NhanVien nv = new NhanVien("Thao", 22, "Quang Tri", 300, 100);
        NhanVien nv1 = new NhanVien("Ly", 22, "Khanh Hoa", 300, 200);
        System.out.println(nv.getThongTin());
        System.out.println("----------------------------");
        System.out.println(nv1.getThongTin());
    }
    
}
