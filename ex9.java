package lec5_loop;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = scanner.nextInt();
        int dem = 0;
        double sum = 0;
        while (n != 0) {

            if (n != 0) {
                sum += n;
                dem++;
            }
            System.out.print("Nhap so: ");
            n = scanner.nextInt();
        }
        System.out.println("Trung binh cong: " + sum / dem);
    }
}
