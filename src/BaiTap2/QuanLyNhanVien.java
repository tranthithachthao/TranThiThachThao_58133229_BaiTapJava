/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
class QuanLyNhanVien implements IQuanLy{
     ArrayList<NhanVien> m = new ArrayList<>();

  @Override
    public void them(NhanVien nv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        m.add(nv);
        System.out.println("da them thanh cong");
    }

    @Override
    public void inDS() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for (int i = 0; i < m.size(); i ++)
       {
           System.out.println( m.get(i).getThongTin());
           System.out.println("------------------------------------");
       }
    }
    
 

}
