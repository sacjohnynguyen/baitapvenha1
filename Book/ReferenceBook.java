
package lec10.absstractclass.btvn1.Book;
import java.util.*;
public class ReferenceBook extends Book{
    private String publisher;

    public ReferenceBook(String publisher, String Id, String title, double basePrice) {
        super(Id, title, basePrice);
        this.publisher = publisher;
    }

    public ReferenceBook() {
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    @Override
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Enter publisher: ");
        setPublisher(scanner.nextLine());
    }
    public boolean updateBookById(String Id){
        Scanner scanner = new Scanner(System.in);
        super.updateBookById(Id);
        System.out.print("Enter publisher: ");
        setPublisher(scanner.nextLine());
        return true;
    }
    void xuat(){
        super.xuat();
        System.out.println(toString());
    }
    @Override
    public void displayDetail(){
        System.out.println("===Reference Book===");
        System.out.println("Publisher: "+getPublisher());
    }
    @Override
    public double caculatePrice(){
        double s;
        return s=getBasePrice()*0.2;
    }
}
