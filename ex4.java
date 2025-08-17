
package baitap;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so thuc thu nhat: ");
        Float f1 = scanner.nextFloat();
        System.out.print("Nhap so thuc thu hai: ");
        Float f2 = scanner.nextFloat();
        System.out.println((f1+f2)/2);
    }
}
