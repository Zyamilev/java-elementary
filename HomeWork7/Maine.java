package HomeWork7;
//суть я уловил. не стал дублировать на всех животных
public class Maine {
    public static void main(String[] args) {
        Animals cat = new Cat("Black", 5, 5, 5, "Murzik");
        Animals dog = new GuideDog("black", 5, 5, 5, "Sharik");
        Animals lion = new Lion("Red", 8, 125, 88);
        Animals fish = new Fish("Gold", 1, 2, 6);
        Animals giraffe = new Giraffe("Yellow", 5, 250, 639);
        Animals crocodile=new Crocodile("Green",26,300,7);
        Animals[] animals = {cat, dog, lion, fish, giraffe,crocodile};
        for (Animals a : animals) {
            a.voice();
        }
    }
}
