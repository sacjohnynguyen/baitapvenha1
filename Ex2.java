
package baitap;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String string=scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi=scanner.nextInt();
        System.out.println("Hello "+string+" "+tuoi);
    }
}
