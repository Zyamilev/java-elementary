import java.util.Scanner;

public class HomeWork3Task4A {
    public static void main(String[] args) {
        System.out.println("введите ширину прямоугольника-целое число");
        Scanner scanner=new Scanner(System.in);
        int weight=scanner.nextInt();
        System.out.println("введите длину прямоугольника-целое число");
        int height=scanner.nextInt();
        for (int i=0;i<height;i++){
            for (int j=0;j<weight;j++){
                if (i==0||i==height-1||j==0||j==weight-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
