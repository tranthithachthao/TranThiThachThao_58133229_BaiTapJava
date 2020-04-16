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
public class Baitap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SinhVienIT it = new SinhVienIT(8, 9, 8, "Tran Thi Thach Thao", "IT");
       SinhVienBiz kt = new SinhVienBiz(8, 8, "Phan Thi Truc Ly", "KT");
       SinhVienPoly s = new SinhVienBiz(9, 7, "Nguyen Thi Thu", "KT");
       
        it.xuat();
        System.out.println("---------------------------");
        kt.xuat();
        System.out.println("-----------------------------");
        s.xuat();
    }
    
}
