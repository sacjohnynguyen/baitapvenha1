
package lec10.absstractclass.nonabstractmethod.book;
import java.util.*;
public class TextBook extends Book{
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void addBook(){
        super.addBook();
        System.out.print("Enter subject: ");
        setSubject(scanner.nextLine());
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(", Subject: "+getSubject());
    }
    public void updateBook(){
        super.updateBook();
        System.out.print("Enter subject: ");
        setSubject(scanner.nextLine());
    }
    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() *0.1;
    }
}
