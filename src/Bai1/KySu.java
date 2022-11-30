package Bai1;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String fullName, String address, String gender, String nganhDaoTao) {
        super(fullName, address, gender);
        this.nganhDaoTao = nganhDaoTao;
    }
    public void themMoiCanBo(Scanner sc) {
        super.themMoiCanBo(sc);
        System.out.print("Nhập ngành đào tạo: ");
        nganhDaoTao = sc.nextLine();
    }
    public void hienThiThongTinCanBo(){
        super.hienThiThongTinCanBo();
        System.out.println("\nNgành đào tạo : " + nganhDaoTao);
    }
}
