package HomeWork8;


import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection myConteiner = new MyConteiner();
        myConteiner.add("Summer");
        String summer = "Summer";
        System.out.println(myConteiner.contains(summer));
        myConteiner.clear();
        System.out.println(myConteiner.size());
        System.out.println(myConteiner.size());
        Collection arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        myConteiner.addAll(arrayList);
        System.out.println(myConteiner);
    }
}
