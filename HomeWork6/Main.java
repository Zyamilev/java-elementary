package HomeWork6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] massOne = {5, 8, 1, 20, 7, 1};
        int[] massTwo = {9, 88, 4, 0, 1, 56};
        int[] massThree = {5, 8, 1, 20, 7, 1};

        Container container = new Container();
        System.out.println(container.getSize(massOne));
        System.out.println(Arrays.toString(massOne));
        System.out.println(Arrays.toString(container.sort(massOne)));
        System.out.println(Arrays.toString(container.clear(massOne)));
        System.out.println(container.contains(massOne, 8));
        container.find(massOne, 20);
        System.out.println(container.compareArrays(massOne, massThree));
        System.out.println(Arrays.toString(container.addNumber(massOne, 1000)));
        System.out.println(Arrays.toString(container.addAll(massOne, massTwo)));
    }
}
