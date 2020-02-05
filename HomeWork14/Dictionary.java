package HomeWork14;

import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("Table", "Стол");
        hashMap.put("Pen", "Ручка");
        hashMap.put("Book", "Книга");
        String translate = (String) hashMap.get("Table");
        System.out.println(translate);


    }
}
