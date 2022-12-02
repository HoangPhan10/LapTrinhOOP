package Bai2;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String nhaXuatBan, int soBanPhatHanh) {
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void themMoiTaiLieu(Scanner sc){
        System.out.print("Nhập mã tài liệu : ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản : ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhập số bản phát hành : ");
        soBanPhatHanh = sc.nextInt();

        sc.nextLine();
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public void hienThiTaiLieu(){
        System.out.println("Mã tài liệu :"+maTaiLieu);
        System.out.println("Tên nhà xuất bản : "+nhaXuatBan);
        System.out.println("Số bản phát hành : "+soBanPhatHanh);
    }

}
