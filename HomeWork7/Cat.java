package HomeWork7;

public class Cat extends Pet {


    Cat(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id, name);
    }


    @Override
    public void voice() {
        System.out.println("Hello"+" my name is "+getName()+" Meow");
    }
}
