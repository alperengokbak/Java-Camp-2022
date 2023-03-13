package src.works;

import java.util.*;

public class project1PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Enter the valid number: ");
        int number = sc.nextInt();


        if(number == 1){
            System.out.println("1 is not Prime Number.");
            System.exit(1);
        }
        if(2 > number){
            System.out.println("Invalid Number.");
            System.exit(1);
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " is Prime Number.");
        } else{
            System.out.println(number + " is not Prime Number.");
        }
        sc.close();
    }
}
