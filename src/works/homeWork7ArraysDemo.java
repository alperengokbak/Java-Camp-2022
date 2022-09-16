package src.works;

public class homeWork7ArraysDemo {
    public static void main(String[] args) {
        double[] myList = {1.2 , 2.3 , 5.4 , 6.3};
        double sum = 0;
        double maxValue = myList[0];

        for (double number : myList) {
            if(maxValue < number){
                maxValue = number;
            }
            System.out.println(number);
            sum += number;
        }
        System.out.println("The biggest number: " + maxValue);
        System.out.println("Totally: " + sum);
    }
}
