package HomeWork3;

import java.util.Scanner;

public class HomeWork3Task1 {

    public static void main(String[] args) {
        System.out.println("введите первое число");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("введите второе число");
        int number2 = sc.nextInt();
        int sredneeArifm = (number1 + number2) / 2;
        System.out.println("среднее арифметическое двух чисел " +
                number1 + " и " + number2 + " равно " + sredneeArifm);
    }
}
