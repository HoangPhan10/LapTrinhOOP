package Bai2;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    public void themMoiTaiLieu(Scanner sc){
        super.themMoiTaiLieu(sc);
        System.out.print("Nhập tên tác giả : ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhập số trang sách : ");
        soTrang = sc.nextInt();
    }

    public void hienThiTaiLieu(){
        super.hienThiTaiLieu();
        System.out.println("Tên tác giả : "+tenTacGia);
        System.out.println("Số trang sách : "+soTrang);
    }
}
