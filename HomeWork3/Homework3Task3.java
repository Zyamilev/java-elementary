package HomeWork3;

import java.util.Scanner;

public class Homework3Task3 {
    public static void main(String[] args) {
        System.out.println("введите сумму депозита (грн.)");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextInt();
        System.out.println("введите процентную ставку");
        int rate = sc.nextInt();
        System.out.println("введите срок депозита (год)");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double R = 0;
            for (int j = 0; j < 12; j++) {
                R = R + (sum * rate * 30) / 36500;
                sum = sum + (sum * rate * 30) / 36500;
            }
            System.out.print("Накопленая сумма депозита за " + i + "-й год: ");
            System.out.format("%.2f%n", sum);
            System.out.print("Начисленые проценты по депозиту за " + i + "-й год: ");
            System.out.format("%.2f%n", R);
            System.out.println();
        }
    }
}









