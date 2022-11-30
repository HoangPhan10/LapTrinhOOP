package Bai1;

import java.util.Scanner;

public class CanBo {
    private String fullName;
    private String address;
    private String gender;

    public CanBo() {
    }

    public String getFullName() {
        return fullName;
    }

    public CanBo(String fullName, String address, String gender) {
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
    }

    public void themMoiCanBo(Scanner sc) {
        System.out.println("---------------Nhập thông tin cán bộ----------");
        System.out.print("Nhập họ và tên : ");
        fullName = sc.nextLine();
        System.out.print("Nhập địa chỉ : ");
        address = sc.nextLine();
        System.out.print("Nhập giới tính : ");
        gender = sc.nextLine();
    }

    public void hienThiThongTinCanBo() {
        System.out.print("\nHọ và tên : " + fullName);
        System.out.print("\nĐịa chỉ : " + address);
        System.out.print("\nGiới tính : " + gender);
    }


}
