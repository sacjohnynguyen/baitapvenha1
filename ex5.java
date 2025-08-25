package lec5_loop;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        System.out.println("The factorial of " + n + " is: " + tich);
    }
}
