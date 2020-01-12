package HomeWork6;


public class Container {

    public int getSize(int[] mas) {

        return mas.length;
    }

    public int[] clear(int[] mas) {
        return mas = new int[0];
    }

    public int[] sort(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        return mas;
    }

    public boolean contains(int[] mas, int number) {
        for (int x : mas) {
            if (x == number) {
                return true;

            }
        }
        return false;
    }

    public void find(int[] mas, int number) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == number) {
                System.out.println("index of number " + number + " is " + i);
            }

        }
    }

    public boolean compareArrays(int[] mas1, int[] mas2) {
        boolean b = true;
        if (mas1 == null && mas2 == null) {
            return false;
        }
        if (mas1.length != mas2.length) {
            return false;
        }
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] != mas2[i]) {
                return false;
            }
        }
        return b;
    }

    public int[] addNumber(int[] mas, int num) {
        int[] newMas = new int[mas.length + 1];
        for (int i = 0; i < mas.length; i++) {
            newMas[i] = mas[i];

        }
        newMas[mas.length] = num;
        mas = newMas;
        return mas;
    }

    public int[] addAll(int[] mas1, int[] mas2) {
        int[] newMas = new int[mas1.length + mas2.length];
        for (int i = 0; i < mas1.length; i++) {
            newMas[i] = mas1[i];
        }
        int x = 0;
        for (int i = mas1.length; i < (mas1.length + mas2.length); i++) {
            newMas[i] = mas2[x];
            x++;
        }
        return newMas;
    }


}



