package lec5_loop;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu cao: ");
        int h = scanner.nextInt();
        System.out.print("Chieu rong: ");
        int w = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
