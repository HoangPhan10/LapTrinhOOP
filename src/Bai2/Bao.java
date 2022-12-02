package Bai2;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void themMoiTaiLieu(Scanner sc){
        super.themMoiTaiLieu(sc);
        System.out.print("Nhập ngày phát hành : ");
        ngayPhatHanh = sc.nextLine();

    }

    public void hienThiTaiLieu(){
        super.hienThiTaiLieu();
        System.out.println("Ngày phát hành : "+ngayPhatHanh);
    }
}
