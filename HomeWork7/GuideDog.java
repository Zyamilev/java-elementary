package HomeWork7;

public class GuideDog extends Dog {


    GuideDog(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id, name);
    }



    @Override
    public void voice() {
        if (isTrained()) {
            super.voice();
        } else System.out.println("Hello, my name is " + getName() + " Wow");
    }
}
