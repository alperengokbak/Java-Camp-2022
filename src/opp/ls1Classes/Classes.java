package src.opp.ls1Classes;

public class Classes {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();
        info1();
    }
    public static void info1(){
        int[] numbers = {18, 25, 30}; // int[] numbers = new int[];, int[] numbers2 = new int[] {10, 12, 43};
        int[] numbers2 = new int[] {10, 12, 43};    // (Arrays type of reference) so if you equal both of these array and after that change variable one of them, you'll see other arrays change at the same time.
        numbers = numbers2;
        numbers[0] = 10;
        System.out.println(numbers2[0]);
    }
}
