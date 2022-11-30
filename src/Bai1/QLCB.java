package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb;
    public QLCB(){
        dscb = new ArrayList<CanBo>(10);
    }
    public QLCB(ArrayList<CanBo> dscb) {
        this.dscb = dscb;
    }

    public void themCanBo(int luaChon, Scanner sc){
        CanBo canBo = new CanBo();
        switch (luaChon){
            case 1:
                canBo = new CongNhan();
                break;
            case 2:
                canBo = new NhanVien();
                break;
            case 3:
                canBo = new KySu();
                break;
        }
        canBo.themMoiCanBo(sc);
        dscb.add(canBo);
    }
    public void hienThiDanhSachCanBo(){
        System.out.println("--------------Hiện thị danh sách sinh viên---------------");
        int count = 1;
        for(CanBo cb :dscb){
            System.out.print(count);
            cb.hienThiThongTinCanBo();
            count++;
        }
    }

    public void timKiemTheoTen(String hoTen){
        for(CanBo cb : dscb){
            if(cb.getFullName().equals(hoTen)){
                cb.hienThiThongTinCanBo();
            }
        }
    }

}
