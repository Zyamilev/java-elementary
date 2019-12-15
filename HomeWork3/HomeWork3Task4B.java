package HomeWork3;

import java.util.*;
public class HomeWork3Task4B {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || j == 0 || i == 7 || j == 7 || i == j||i==7-j) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
