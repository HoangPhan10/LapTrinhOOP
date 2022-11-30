import Bai1.CanBo;
import Bai1.QLCB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        int luaChon = 0;
        while(luaChon!=4) {
            System.out.println("--------------MENU---------------");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiện thi thông tin về danh sách các cán bộ");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn : ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Thêm mới cán bộ : 1-CongNhan,2-NhanVien,3-KySu");
                    System.out.print("Lua chon : ");
                    int check = scanner.nextInt();
                    scanner.nextLine();
                    qlcb.themCanBo(check,scanner);
                    break;
                case 2:
                    System.out.print("Nhập họ tên cần tìm :");
                    String name = scanner.nextLine();
                    qlcb.timKiemTheoTen(name);
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    System.out.println("kết thúc");
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn");
                    break;
            }
        }
    }
}