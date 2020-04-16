/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Dell
 */
public class Baitap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.them(new NhanVien("Thao", 22, "Quang Tri", 300, 100));
        ql.them(new NhanVien("Ly", 22, "Khanh Hoa", 300, 200));
        ql.them(new NhanVien("Thanh", 22, "Khanh Hoa", 300, 150));
        ql.them(new NhanVien("Huynh", 22, "Phu Yen", 300, 250));
        ql.them(new NhanVien("Kha", 22, "Phu Yen", 300, 200));
        System.out.println("--------------------------------");
        ql.inDS();
    }
    
}
