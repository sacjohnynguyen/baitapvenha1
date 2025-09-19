
package lec10.absstractclass.nonabstractmethod.book;
import java.util.*;
public abstract class Book implements IBook{
    private String id;
    private String title;
    private double basePrice;
    Scanner scanner = new Scanner(System.in);
    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public void addBook(){
        System.out.print("Enter Id: ");
        setId(scanner.nextLine());
        System.out.print("Enter title: ");
        setTitle(scanner.nextLine());
        System.out.print("Enter base price: ");
        setBasePrice(Double.parseDouble(scanner.nextLine()));
    }
    
    public void displayDetails(){
        System.out.print("id=" + getId() + ", title=" + getTitle() + ", basePrice=" + getBasePrice());
    }
    public void updateBook(){
        System.out.print("Enter title: ");
        setTitle(scanner.nextLine());
        System.out.print("Enter base price: ");
        setBasePrice(Double.parseDouble(scanner.nextLine()));
    }
    public abstract double calculatePrice();
}
