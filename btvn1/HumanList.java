
package lec10.absstractclass.btvn1;
import java.util.*;
public class HumanList {

    static void themDanhsach(SinhVien sinhvien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void themDanhsach(GiaoVien giaovien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    ArrayList<Human> HumanList = new ArrayList<>();
    public void themDanhSach(Human human){
        human.nhap();
        human.xuatThongTin();
        System.out.println("Them thanh cong");
    }
    public void xuatDanhSach(){
        if(HumanList.size() == 0){
            System.out.println("Danh sach rong");
        }
        else{
            for(int i = 0;i<HumanList.size();i++){
                HumanList.get(i).xuatThongTin();
            }
        }
    }
}
