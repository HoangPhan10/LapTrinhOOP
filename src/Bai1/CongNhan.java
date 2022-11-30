package Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String fullName, String address, String gender, String bac) {
        super(fullName, address, gender);
        this.bac = bac;
    }

    public void themMoiCanBo(Scanner sc) {
        super.themMoiCanBo(sc);
        System.out.print("Nhập bậc: ");
        bac = sc.nextLine();
    }
    public void hienThiThongTinCanBo(){
        super.hienThiThongTinCanBo();
        System.out.println("\nBac : " + bac);
    }
}
