import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        double num_1;
        double num_2;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите первое число");
        num_1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        num_2 = scanner.nextDouble();
        double umn = num_1 * num_2;
        double del = num_1 / num_2;
        double sum = num_1 + num_2;
        double minus = num_1 - num_2;
        System.out.println("деление " + num_1 + " на " + num_2 + " равно " + del);
        System.out.println("умножение " + num_1 + " на " + num_2 + " равно " + umn);
        System.out.println("сумма " + num_1 + " и " + num_2 + " равна " + sum);
        System.out.println("вычитание " + num_1 + " от " + num_2 + " равно " + minus);
    }
}
