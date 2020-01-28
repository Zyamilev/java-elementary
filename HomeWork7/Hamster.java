package HomeWork7;

public class Hamster extends Pet {

    Hamster(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id, name);
    }

    @Override
    public void voice() {
        System.out.println(getColor() + " humster " + getAge() +
                " years old " + "weight" + " is " + getWeight()
                + " " + getName() + " said " + " ffff" + " " + getId());
    }
}
