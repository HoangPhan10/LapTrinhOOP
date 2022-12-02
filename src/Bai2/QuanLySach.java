package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<TaiLieu> listTaiLieu;

    public QuanLySach() {
        this.listTaiLieu = new ArrayList<TaiLieu>(10);
    }

    public void themMoiTaiLieu(){
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("1 - Sách,2 - Tạp Chí,3 - Báo ");
        luaChon = sc.nextInt();
        sc.nextLine();
        TaiLieu taiLieu = new TaiLieu();
        switch (luaChon){
            case 1:
                taiLieu = new Sach();
                break;
            case 2:
                taiLieu = new TapChi();
                break;
            case 3:
                taiLieu = new Bao();
                break;
        }
        taiLieu.themMoiTaiLieu(sc);
        listTaiLieu.add(taiLieu);
    }

    public void xoaTaiLieuTheoMa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tài liệu cần xóa :");
        String maTaiLieu = sc.nextLine();
        for(TaiLieu tl :listTaiLieu){
            if(tl.getMaTaiLieu().equals(maTaiLieu)){
                listTaiLieu.remove(tl);
                System.out.println("Xóa tài liệu thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy mã tài liệu");
    }

    public void hienThiDanhSachTaiLieu(){
        for(TaiLieu tl :listTaiLieu){
            tl.hienThiTaiLieu();
        }
    }
    public void timKiemTaiLieuTheoMa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tài liệu cần tìm :");
        String maTaiLieu = sc.nextLine();
        for(TaiLieu tl :listTaiLieu){
            if(tl.getMaTaiLieu().equals(maTaiLieu)){
                tl.hienThiTaiLieu();
                return;
            }
        }
        System.out.println("Không tìm thấy mã tài liệu");
    }

    public void timKiemTaiLieuTheoLoai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loại tài liệu :");
        String loaiTaiLieu = sc.nextLine();
        for(TaiLieu tl:listTaiLieu){
            if(loaiTaiLieu.equals("Sách")&&(tl instanceof Sach)){
                tl.hienThiTaiLieu();
            }else if(loaiTaiLieu.equals("Tạp Chí")&&(tl instanceof TapChi)){
                tl.hienThiTaiLieu();
            }else if(loaiTaiLieu.equals("Báo")&&(tl instanceof Bao)){
                tl.hienThiTaiLieu();
            }
        }
    }
}
