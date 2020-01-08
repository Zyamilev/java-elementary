package HomeWork5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Groupe groupe = new Groupe();
        Student studVova = new Student("Vova", "Ivanov");
        Student studKat = new Student("Katya", "Sidorova");
        Student studPetya = new Student("Petya", "Petrov");
        Student studBob = new Student("Bob", "Bruan");
        studVova.setMarks(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(studVova.getMarks()));

        groupe.addStudent(studVova);
        groupe.addStudent(studKat);
        groupe.addStudent(studPetya);
        groupe.printInfo();
        System.out.println();
        groupe.delStudent(studKat);
        groupe.printInfo();

        groupe.find(studBob);
    }
}
