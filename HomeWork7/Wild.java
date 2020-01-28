package HomeWork7;

abstract class Wild extends Animals {
    Wild (String color,int age,int weight,int id){
        super(color, age, weight, id);
    }
    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    boolean isPredator;

    @Override
    void voice() {
        System.out.print("Hello " + "I am a wild animal ");
    }
}

