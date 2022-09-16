package src.works;
import java.util.*;

public class work5Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid edge: ");
        int input = sc.nextInt();

        // For Loop
        for(int i = 1; i <= input; i++){
            System.out.println(i);
        }

        // While Loop
        int counter = 0;
        while (counter < input) {
            ++counter;
            System.out.println(counter);
        }

        // Do-While Loop
        // There is a difference that difference is even if not provided conditional, do-while running the code at least one time.
        int number = 0;
        do {
            number += 2;
            System.out.println(number);
        } while (number < input);


        sc.close();
    }
}
