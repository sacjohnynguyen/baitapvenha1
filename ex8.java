package lec5_loop;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int n = scanner.nextInt();
        while (n < 1 || n > 10) {
            System.out.print("Invalid number, enter try again: ");
            n = scanner.nextInt();
        }
        System.out.println("You entered the number: " + n);
    }
}
