
package lec10.absstractclass.btvn1.Book;
import java.util.*;
public abstract class Book implements IBook{
    private String Id;
    private String title;
    private double basePrice;

    public Book(String Id, String title, double basePrice) {
        this.Id = Id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public Book() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin sach: ");
        System.out.print("Nhap Id: ");
        setId(scanner.nextLine());
        System.out.print("Nhap tieu de: ");
        setTitle(scanner.nextLine());
        System.out.print("Nhap gia cua sach: ");
        setBasePrice(Double.parseDouble(scanner.nextLine()));
    }
    public boolean updateBookById(String Id){
        if(Objects.equals(this.Id, Id)){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Id: ");
        setId(Id);
        System.out.print("Nhap tieu de: ");
        setTitle(scanner.nextLine());
        System.out.print("Nhap gia cua sach: ");
        setBasePrice(Double.parseDouble(scanner.nextLine()));
        return true;
    }else {return false;}
    }
    void xuat(){
        System.out.println("Sach {"+" Id "+getId()+" Tieu de: "+getTitle()+" Gia "+getBasePrice()+" }");
        
    }
    public abstract double caculatePrice();

    
}
