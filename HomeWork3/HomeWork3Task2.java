package HomeWork3;

import java.util.Scanner;

public class HomeWork3Task2 {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        for (; ; ) {
            System.out.println("введите число");
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            if (num == -1) {
                System.out.println("среднее арифметическое = "+sum / count);
                break;
            }
            ++count;
            sum += num;
        }


    }
}
