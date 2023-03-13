package src.works;

import java.util.Scanner;

public class project5FindNumber {
    static Scanner sc = new Scanner(System.in);
    static int[] numbers = new int[5];

    public static void fillUpArray(){
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter the number to fill up the array: ");
            int number = sc.nextInt();
            sc.nextLine();
            numbers[i] = number;
        }
    }
    public static void findingNumberFunc(){
        System.out.print("Enter the number what you find.");
        int findingNumber = sc.nextInt();
        boolean existsNumber = false;

        for(int i = 0; i < numbers.length; i++){
            if (findingNumber == numbers[i]) {
                existsNumber = true;
                break;
            }
        }
        if (existsNumber) {
            System.out.println(findingNumber + " is existing inside of array.");
        }else{
            System.out.println(findingNumber + " is not existing inside of array.");
        }
    }

    public static void main(String[] args) {
        fillUpArray();
        findingNumberFunc();
        sc.close();
    }
}
