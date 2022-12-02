package Bai2;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public void themMoiTaiLieu(Scanner sc){
        super.themMoiTaiLieu(sc);
        System.out.print("Nhập số phát hành : ");
        soPhatHanh = sc.nextInt();
        System.out.print("Nhập tháng phát hành : ");
        thangPhatHanh = sc.nextInt();
    }

    public void hienThiTaiLieu(){
        super.hienThiTaiLieu();
        System.out.println("Số phát hành : "+soPhatHanh);
        System.out.println("Tháng phát hành : "+thangPhatHanh);
    }
}
