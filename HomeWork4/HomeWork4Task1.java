package HomeWork4;

import java.util.Scanner;

public class HomeWork4Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int num = 0;
        for (; ; ) {
            int y = a % 10;
            a = a / 10;
            num = num + y;
            if (a == 0) {

                break;
            }

        }
        System.out.println("Сумма всех чисел равна " + num);
    }


}
