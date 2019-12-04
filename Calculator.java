
import java.util.Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner_1 = new Scanner(System.in);
        double num_1 = scanner_1.nextDouble();
        System.out.println("Веедите второе число");
        Scanner scanner_2 = new Scanner(System.in);
        double num_2 = scanner_2.nextDouble();
        double umn = num_1 * num_2;
        double del = num_1 / num_2;
        System.out.println("деление " + num_1 + " на " + num_2 + " равно " + del);
        System.out.println("умножение " + num_1 + " на " + num_2 + " равно " + umn);
    }
}
