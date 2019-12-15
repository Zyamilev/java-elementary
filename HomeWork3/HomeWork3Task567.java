package HomeWork3;

import java.util.Scanner;

public class HomeWork3Task567 {
    public static void main(String[] args) {
        System.out.println("введите число для определения четности");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("число " + num + " четное");
        } else {
            System.out.println("число " + num + " не четное");
        }
        System.out.println();
        System.out.println("введите число для определения простое оно или нет");
        int num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("число " + num1 + " составное");
        } else {
            System.out.println("число " + num1 + " простое");
        }
        System.out.println();
        System.out.println("введите число для определения каким числам оно кратно");
        int num2 = scanner.nextInt();
        for (int i = 2; i <= num2; i++) {
            if (num2 % i == 0) {
                System.out.println("число " + num2 + " кратно " + i + "  ");
            }

        }
    }
}
