package src.opp.ls2RecapDemoClasses;

public class fourProcessors {
    public int Addition(int num1, int num2){
        return num1 + num2;
    }
    public int Addition(int... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    public int Multiplication(int num1, int num2){
        return num1 * num2;
    }
    public int Division(int num1, int num2){
        return num1 / num2;
    }
}
