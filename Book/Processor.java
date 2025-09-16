
package lec10.absstractclass.btvn1.Book;
import java.util.*;
public class Processor {
    public static void main(String[] args){
        BookList booklist = new BookList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu: ");
            System.out.println("1.Chon sach (TextBook/ReferenceBook)");
            System.out.println("2.XuatDanhSach");
            System.out.println("3.Thoat");
            System.out.println("Chon chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:System.out.println("Them 1 sach ");
                    System.out.println("1.TextBook/2.ReferenceBook");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    if(choice2==1){
                        TextBook tb = new TextBook();
                        booklist.addBook(tb);
                    }
                    else if(choice2==2){
                        ReferenceBook rb = new ReferenceBook();
                        booklist.addBook(rb);
                    }break;
                case 2: System.out.println("Xuat danh sach: ");
                booklist.displayBook();
                break;
                case 3:break;
                default:System.out.println("Fail");
            }
            System.out.println("1 tiep tuc 2 khong");
            choice =Integer.parseInt(scanner.nextLine());
        }while(choice !=0);
    }
}
