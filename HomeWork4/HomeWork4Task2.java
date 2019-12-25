package HomeWork4;

import java.util.Scanner;

public class HomeWork4Task2 {
    public static void main(String[] args) {
        System.out.println("Введите координаты Х и Y левого верхнего угла");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Введите координаты Х и Y правого нижнего угла");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Введите координаты Х и Y точки");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        if (x3 < x1 && x3 > x2 && y3 > y1 && y3 < y2) {
            System.out.println("точка принадлежит");

        } else {
            System.out.println("не принадлежит");
        }
    }
}
