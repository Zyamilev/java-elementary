import java.util.Scanner;

public class HomeWork3Task4A {

    public static void main(String[] args) {
        int width = getWidth();
        int height = getHeight();
        draw(height, width);
    }


    static int getWidth() {
        System.out.println("Введите ширину прямоугольника-целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if ((num <= 0)) {
                System.out.println("Вы ввели не целое положительное число. Попробуйте еще раз");
                num = getWidth();
            }
        } else {
            System.out.println("Вы ввели не целое положительное число. Попробуйте еще раз");
            num = getWidth();
        }

        return num;
    }


    static int getHeight() {
        System.out.println("Введите длину прямоугольника-целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Вы ввели не целое положительное чсило. Попрбуйте еще раз ");
                num = getHeight();
            }
        } else {
            System.out.println("Вы ввели не целое положительное чсило. Попрбуйте еще раз");
            num = getHeight();
        }
        return num;
    }

    static void draw(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || j == 0 || i == x - 1 || j == y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
