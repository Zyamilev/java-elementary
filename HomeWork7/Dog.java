package HomeWork7;

public class Dog extends Pet {

    Dog(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id, name);

    }

    @Override
    public void voice() {
        {
            System.out.println(getColor() + " dog " + getAge() + " years old " + "weight" + " is " + getWeight()
                    + " " + getName() + " said  Woof" + " " + getId());
        }
    }
}
