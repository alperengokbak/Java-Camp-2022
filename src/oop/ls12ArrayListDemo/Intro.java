package src.oop.ls12ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();   // You dont have to define type of arraylist, that's why, you can use String variable with integer at the same time. If you dont define "<Interger>" or <String>.

        numbers.add(25);
        numbers.add(18);
        numbers.add(30);
        
        // numbers.set(0, 18);   // That command provide to set the any index line variable to change.
        // numbers.set(1, 25);
        // System.out.println(numbers.get(1));

        // numbers.remove(2);  // You can remove variable on defined index number.
        // numbers.clear();
        // System.out.println(numbers.get(0));
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
