package src.works;
import java.util.Scanner;

public class homeWork3TheBiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        try {
            System.out.print("How many do you entry number: ");
            count = input.nextInt();
            for(int i = 1; i<=count; i++){
                System.out.print("Enter The Number " + i + ": ");
                number = input.nextInt();

                    if(number > max){
                        max = number;
                    }
            
                    if(number < min || (number > min && max > number)){
                        min = number;
                    }
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("The Highest Number: " + max);
        System.out.println("The Lowest Number: " + min);
        input.close();
    }
}
