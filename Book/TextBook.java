
package lec10.absstractclass.btvn1.Book;
import java.util.*;
public class TextBook extends Book{
    private String subject;

    public TextBook(String subject, String Id, String title, double basePrice) {
        super(Id, title, basePrice);
        this.subject = subject;
    }

    public TextBook() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public boolean updateBookById(String Id){
        Scanner scanner = new Scanner(System.in);
        super.updateBookById(Id);
        System.out.print("Enter subject: ");
        setSubject(scanner.nextLine());
        return true;
    }
    
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Enter subject: ");
        setSubject(scanner.nextLine());
    }
    
    void xuat(){
        super.xuat();
        System.out.println(toString());
    }
    @Override
    public double caculatePrice(){
        double s;
        return s = getBasePrice()*0.1;
    }
}
