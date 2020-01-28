package HomeWork7;

class Fish extends Animals {

    Fish(String color, int age, int weight, int id) {
        super(color, age, weight, id);
    }

    @Override
    void voice() {
        System.out.println("........");
    }
}
