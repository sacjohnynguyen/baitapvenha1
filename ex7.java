package lec5_loop;

import java.util.*;
import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int x1 = rand.nextInt(100) + 1;
        System.out.print("Nhap so doan: ");
        int n = scanner.nextInt();
        while (x1 != n) {

            if (n > x1) {
                System.out.println("Your number is higher than the secret number");
            } else if (n < x1) {
                System.out.println("Your number is lower than the secret number");
            }
            System.out.print("Nhap so doan: ");
            n = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed correctly!");
    }
}
