package src.works;

import java.util.Scanner;

public class project4FriendNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the number2: ");
        int number2 = sc.nextInt();
        int sum = 0;
        int sum2 = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        for(int i = 1; i < number2; i++){
            if(number2 % i == 0){
                sum2 += i;
            }
        }
        if (sum == number2 && sum2 == number) {
            System.out.println(number + " " + number2 + " are friend numbers.");
        }else{
            System.out.println(number + " " + number2 + " are not friend numbers.");
        }
        sc.close();
    }
}
