
package lec10.absstractclass.nonabstractmethod.book;
import java.util.*;
public class Processor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Booklist booklist = new Booklist();
        int choice;
        do{
            System.out.println("\nMenu");
            System.out.println("0. exit");
            System.out.println("1. add book");
            System.out.println("2. Display details");
            System.out.println("3. update book");
            System.out.println("4. delete book");
            System.out.println("5. find book");
            System.out.println("6. find most expensive book");
            System.out.println("7 count book");
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 0: System.out.println("Exit"); break;
                case 1: 
                    System.out.println("Them sach gi? 1 Text Book/ 2 Reference Book");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    if(choice2 == 1){
                        TextBook textbook = new TextBook();
                        booklist.addBook(textbook);
                    }
                    else if(choice2 == 2){
                        ReferenceBook referenceBook = new ReferenceBook();
                        booklist.addBook(referenceBook);
                    }
                    else{System.out.println("Nhap sai r");}
                    break;
                case 2:System.out.println("\nlist of all book: ");
                booklist.displayAllDetails();break;
                case 3:System.out.println("Nhap id check");
                booklist.updateBook(scanner.nextLine());break;
                case 4: System.out.println("xoa sach: ");
                booklist.deleteBookById(scanner.nextLine());break;
                case 5: System.out.println("Tim sach: ");
                booklist.findBookById(scanner.nextLine());break;
                case 6: System.out.println("tim sach gia lon nhat: ");
                booklist.findMostExpensiveBook();break;
                case 7: System.out.println("Dem sach: ");
                booklist.countBook();
                break;
                default:System.out.println("Nhap sai r");break;
                
            }
            System.out.println("1 tiep tuc 2 khong");
            choice = Integer.parseInt(scanner.nextLine());
        }while(choice!=0);
    }
}
