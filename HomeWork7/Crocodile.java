package HomeWork7;

public class Crocodile extends Wild {
    Crocodile(String color,int age, int weight, int id){
        super(color,age,weight,id);
    }
    @Override
    void voice() {
        super.voice();
        System.out.println("and I am hungry");
    }
}
