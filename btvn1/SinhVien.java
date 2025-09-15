
package lec10.absstractclass.btvn1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SinhVien extends Human{
    private String maSinhVien;
    private String renLuyen;

    public SinhVien(String name, Date date, String sex, int id,String maSinhVien, String renLuyen) {
        super(name, date, sex, id);
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public SinhVien() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }
    void danhGiaRenLuyen(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("1 Gioi 2 Kha 3 TB 4 yeu: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1: System.out.println("Gioi");setRenLuyen("Gioi");break;
            case 2: System.out.println("Kha");setRenLuyen("Kha");break;
            case 3: System.out.println("Trung Binh");setRenLuyen("Trung Binh");break;
            case 4: System.out.println("Yeu");setRenLuyen("Yeu");break;
        }
    }
    @Override
    void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma Sinh Vien: ");
        setName(scanner.nextLine());
        System.out.print("Nhap Ren Luyen: ");
        danhGiaRenLuyen();
    }
    void capNhatNguoiBangCMND(int cmnd){
        Scanner scanner = new Scanner(System.in);
        super.capNhatNguoiBangCMND(cmnd);
        System.out.print("Nhap ma Sinh Vien: ");
        setName(scanner.nextLine());
        System.out.print("Nhap Ren Luyen: ");
        danhGiaRenLuyen();
    }
    void xuat(){
        super.xuatThongTin();
        System.out.println(toString());
    }
    @Override
    public void traTienDoxe(){
        System.out.println("4k/1xe");
    }
}
