package HomeWork7;

public class GuideDog extends Dog {
    private boolean trained = true;

    GuideDog(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id, name);
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public void voice() {
        super.voice();
    }
}
