package src.oop.ls13HashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("Book", "Kitap");
        dict.put("Table", "Masa");
        dict.put("Computer", "Bilgisayar");
        System.out.println(dict.size());

        for (String word : dict.keySet()) {
            System.out.println("Element-" + word + " Value-" + dict.get(word));
        }
    }
}
