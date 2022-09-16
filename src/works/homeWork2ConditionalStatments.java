package src.works;

public class homeWork2ConditionalStatments {
    public static void main(String[] args) {
        int number1 = 18;
        int number2 = 18;
        
        if(number1 > number2){
            System.out.println("Number1 bigger than Number2.");
            System.out.println("Number1: " + number1 + "\n" + "Number2: " + number2);
        } else if(number2 < number1){
            System.out.println("Number2 bigger than Number1.");
            System.out.println("Number1: " + number1 + "\n" + "Number2: " + number2);
        } else{
            System.out.println("Both of numbers equals each other.");
        }
    }
}
