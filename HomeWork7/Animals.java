package HomeWork7;

public abstract class Animals {

    private int id;
    private String color;
    private int age;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    Animals(String color, int age, int weight, int id) {

        this.color = color;
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    abstract void voice();


}
