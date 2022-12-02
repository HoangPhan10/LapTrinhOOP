package Bai2;

import java.util.Scanner;

public class MainB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();
        int luachon = 0;
        do {
            menu();
            System.out.print("Nhập lựa chọn : ");
            luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    quanLySach.themMoiTaiLieu();
                    break;
                case 2:
                    quanLySach.xoaTaiLieuTheoMa();
                    break;
                case 3:
                    quanLySach.hienThiDanhSachTaiLieu();
                    break;
                case 4:
                    quanLySach.timKiemTaiLieuTheoLoai();
                    break;
                case 5:
                    quanLySach.timKiemTaiLieuTheoMa();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    return;
                default:
                    break;
            }

        } while (luachon != 6);
    }

    public static void menu(){
        System.out.println("---------------MENU---------------");
        System.out.println("1. Thêm mới tài liệu");
        System.out.println("2. Xóa tài liệu theo mã");
        System.out.println("3. Hiện thị danh sách tài liệu");
        System.out.println("4. Tìm kiếm tài liệu theo loại(Sách,Tạp Chí,Báo)");
        System.out.println("5. Tìm kiếm tài liệu theo mã");
        System.out.println("6. Kết thúc chương trình");

    }
}
