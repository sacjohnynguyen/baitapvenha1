
package baitap;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class ex11 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Date date = new Date();
    System.out.print("Enter Id: ");
    String id = scanner.next();
        scanner.nextLine();
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birthday: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        scanner.nextLine();
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        System.out.print("Enter GPA: ");
        float gpa = scanner.nextFloat();
        System.out.println("STUDENT INFORMATIOn:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Birthday: " + strDate);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
 }
}
