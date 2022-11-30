package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String fullName, String address, String gender, String congViec) {
        super(fullName, address, gender);
        this.congViec = congViec;
    }
    public void themMoiCanBo(Scanner sc) {
        super.themMoiCanBo(sc);
        System.out.print("Nhập công việc : ");
        congViec = sc.nextLine();
    }
    public void hienThiThongTinCanBo(){
        super.hienThiThongTinCanBo();
        System.out.println("\nCông việc : " + congViec);
    }
}
