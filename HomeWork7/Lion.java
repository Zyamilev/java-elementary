package HomeWork7;

class Lion extends Wild {

    Lion(String color, int age, int weight, int id) {
        super(color, age, weight, id);
    }


    @Override
    void voice() {
        super.voice();
        System.out.println("and I am hungry");
    }
}
