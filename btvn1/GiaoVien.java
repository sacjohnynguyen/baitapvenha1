
package lec10.absstractclass.btvn1;
import java.util.*;
public class GiaoVien extends Human{
    private String maGiaoVien;
    private String xepLoaiThiDua;

    public GiaoVien(String maGiaoVien, String xepLoaiThiDua, String name, Date date, String sex, int id) {
        super(name, date, sex, id);
        this.maGiaoVien = maGiaoVien;
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    public GiaoVien() {
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getXepLoaiThiDua() {
        return xepLoaiThiDua;
    }

    public void setXepLoaiThiDua(String xepLoaiThiDua) {
        this.xepLoaiThiDua = xepLoaiThiDua;
    }
    void xepLoaiDua(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("1 A 2 B 3 C");
        choice = Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1: System.out.println("Loai A");setXepLoaiThiDua("A");break;
            case 2: System.out.println("Loai B");setXepLoaiThiDua("B");break;
            case 3: System.out.println("Loai C");setXepLoaiThiDua("C");break;
        }
    }
    @Override
    void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma Giao Vien: ");
        setMaGiaoVien(scanner.nextLine());
        System.out.print("Nhap xep loai thi dua");
        xepLoaiDua();
    }
    void capNhatNguoiBangCMND(int cmnd){
        super.capNhatNguoiBangCMND(cmnd);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma Giao Vien: ");
        setMaGiaoVien(scanner.nextLine());
        System.out.print("Nhap xep loai thi dua");
        xepLoaiDua();
    }
    void xuat(){
        super.xuatThongTin();
        System.out.println(toString());
    }
    @Override
    public void traTienDoxe(){
        System.out.println("2k/1 lượt");
    }
}
