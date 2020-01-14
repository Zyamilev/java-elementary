package HomeWork9;

public class Main {
    public static void main(String[] args) {
        FibRec fibRec = new FibRec();
        double begin = System.currentTimeMillis();
        System.out.println(fibRec.fib(5));
        double end = System.currentTimeMillis();
        double delta = end - begin;
        // System.out.println(delta / 1000 + " sec");

        FibFor fibFor = new FibFor();
        System.out.println(fibFor.fib(8));

        FibCash fibCash = new FibCash();
        System.out.println(fibCash.fib(40));

    }
}
