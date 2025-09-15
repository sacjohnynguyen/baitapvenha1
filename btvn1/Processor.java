
package lec10.absstractclass.btvn1;
import java.util.*;
public class Processor {
    public static void main (String[] args){
        HumanList humanlist = new HumanList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu: ");
            System.out.println("0 Thoat");
            System.out.println("1 Nhap thong tin(Sinh vien/Giao vien)");
            System.out.println("2 Xuat danh sach");
            System.out.println("Chon chuc nang");
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1: System.out.println("Them 1 ng vao danh sach");
                    System.out.println("1 Giao vien/2 Sinh vien");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    if(choice2 == 1){
                        SinhVien sinhvien = new SinhVien();
                        HumanList.themDanhsach(sinhvien);
                    }
                    else if(choice == 2){
                        GiaoVien giaovien = new GiaoVien();
                        HumanList.themDanhsach(giaovien);
                    }
                break;
                case 2: 
            System.out.println("Xuat danh sach: ");
            HumanList.xuat();
            break;
                case 3: break;
                default: System.out.println("Fail");
            }
            System.out.println("Tiep tuc: 1 Co 2 Khong");
            choice=Integer.parseInt(scanner.nextLine());
            
        }while (choice != 0);
    }
}
