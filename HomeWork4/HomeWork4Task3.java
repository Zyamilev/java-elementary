package HomeWork4;


public class HomeWork4Task3 {

    public static void main(String[] args) {

        String[] surname = new String[4];


        int marks[][] = new int[4][9];
        int kol = 0;
        kol = addStudents(surname, "Ivanov", kol);
        kol = addStudents(surname, "Petrov", kol);
        kol = addStudents(surname, "Potapov", kol);
        kol = addStudents(surname, "Kozlov", kol);
        setMark(surname, marks, 5, "Ivanov", 2);
        System.out.println("Изначальный список:");
        print(surname, marks, kol);

        kol = delStudent(surname, marks, "Petrov", kol);
        kol = delStudent(surname, marks, "Kozlov", kol);
        kol = addStudents(surname, "Smirnov", kol);
        System.out.println("Откорректированный список:");
        print(surname, marks, kol);

        contains(surname, "Kozlov", kol);
        contains(surname, "Smirnov", kol);

        System.out.println("Список очистили.");
        clear(surname, marks, kol);
        print(surname, marks, kol);

    }

    private static int delStudent(String[] surname, int[][] marks, String name, int t) {
        int i;
        int vv = marks[0].length;
        for (i = 0; i < t; i++) {
            if (surname[i] == name) {
                break;
            }
        }
        for (int k = i; k < t - 1; k++) {
            surname[k] = surname[k + 1];
            for (int ii = 0; ii < vv; ii++) {
                marks[k][ii] = marks[k + 1][ii];
            }
        }

        surname[t - 1] = null;
        for (int ii = 0; ii < vv; ii++) {
            marks[t - 1][ii] = 0;
        }
        return --t;
    }

    private static void contains(String[] surname, String name, int k) {
        for (int i = 0; i < k; i++) {
            if (surname[i].equals(name)) {
                System.out.println(name + " - такой студент есть в группе");
                return;
            }
        }
        System.out.println(name + " - такого студента нет в группе.");
    }

    private static void clear(String[] surname, int marks[][], int k) {
        for (int i = 0; i < k; i++) {
            surname[i] = null;
            for (int j = 0; j < marks[0].length; j++) {
                marks[i][j] = 0;
            }
        }
    }

    private static int addStudents(String[] surname, String name, int tt) {
        for (int i = 0; i < surname.length; i++) {
            if (surname[i] == null) {
                surname[i] = name;
                return ++tt;
            }
        }
        return tt;
    }


    private static void setMark(String[] surname, int[][] marks, int mark, String name, int lessonIndex) {
        for (int i = 0; i < surname.length - 1; i++) {
            if (surname[i].equals(name)) {
                marks[i][lessonIndex] = mark;
                return;
            }
        }
    }

    static void print(String[] surname, int marks[][], int t) {
        for (int i = 0; i < t; i++) {
            System.out.print(surname[i] + "\t ");
            for (int j = 0; j < marks[0].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

}




