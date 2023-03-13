package src.works;
import java.util.*;

public class project3PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int perfectNum = sc.nextInt();
        int sum = 0;

        if(perfectNum == 1){
            System.out.println("1 is not Prime number!");
            System.exit(1);
        }
        if (perfectNum < 0) {
            System.out.println("Invalid variable.");
        }
        for(int i = 1; i < perfectNum; i++){
            if(perfectNum % i == 0){
                sum += i;
            }
        }
        if (perfectNum == sum) {
            System.out.println(perfectNum + " is Perfect number.");
        }else{
            System.out.println(perfectNum + " is not Perfect number.");
        }

        sc.close();
    }
}
