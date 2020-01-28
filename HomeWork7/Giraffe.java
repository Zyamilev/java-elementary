package HomeWork7;

public class Giraffe extends Wild {

    Giraffe(String color, int age, int weight, int id) {
        super(color, age, weight, id);
    }

    @Override
    void voice() {
        super.voice();
        System.out.println();
    }
}
