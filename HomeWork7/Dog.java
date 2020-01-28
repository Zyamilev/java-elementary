package HomeWork7;

abstract class Dog extends Pet {
    private boolean trained = true;

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    Dog(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id, name);

    }

    @Override
    public void setColor(String color) {
        super.setColor("Black");
    }

    @Override
    public void voice() {
        {
            System.out.println("Hello my name is " + getName() + " Wow");
        }
    }
}
