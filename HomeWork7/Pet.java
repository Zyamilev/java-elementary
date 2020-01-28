package HomeWork7;


abstract class Pet extends Animals {
    private String name;

    private boolean vaccinated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        vaccinated = vaccinated;
    }

    Pet(String color, int age, int weight, int id, String name) {
        super(color, age, weight, id);
        this.name = name;
    }


}
