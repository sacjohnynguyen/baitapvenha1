
package lec10.absstractclass.nonabstractmethod.book;
import java.util.*;
public class ReferenceBook extends Book{
    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher) {
        this.publisher = publisher;
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void addBook(){
        super.addBook();
        System.out.print("Enter publisher");
        setPublisher(scanner.nextLine());
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(", Publisher: "+getPublisher());
    }
    public void updateBook(){
        super.updateBook();
        System.out.print("Enter publisher");
        setPublisher(scanner.nextLine());
    }
    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() * 0.2;
    }
}
