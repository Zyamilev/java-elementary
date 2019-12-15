package HomeWork3;

import java.util.Scanner;

public class Homework3Task4V {
    public static void main(String[] args) {
        System.out.println("vvedite stroki");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        System.out.println("vvedite stolb");
        int stolb = scanner.nextInt();
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stolb; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
