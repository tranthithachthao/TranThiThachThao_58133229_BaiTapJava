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
public class NhanVien {
        String ten;
    int tuoi;
    String diaChi;
    double luong;
    int gioLam;

    public NhanVien() {
    }
    
    
     public NhanVien(String ten, int tuoi, String diaChi, double luong, int gioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luong = luong;
        this.gioLam = gioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getGioLam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

   public String getThongTin(){
       return "Ten: "+ ten + "\n"
                +"Tuoi: " + tuoi +"\n"
                +"Dia Chi: "+ diaChi +"\n"
                +"Luong: "+luong + "\n"
                +"Gio lam: "+ gioLam + "\n"
                +"Tien thuong: " +tinhThuong() + "\n";
   }

    private double tinhThuong() 
         
    {
        double n;
        if(gioLam < 100){
            n = 0;
        }
        else 
            if(100 <= gioLam && gioLam < 200){
            n = luong * 0.1;
           
        }
        else
                n = luong * 0.2;
         return n;
    
    }
    
    
}
