
package baitap;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##|\\n");
        System.out.println("Nhap gi do voi ##: ");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
