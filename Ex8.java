
package baitap;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten day du: ");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
