package src.works;

public class work10Methods {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
        int[] numbers = {18, 25, 30, 12};
        int wanted = 18;
        boolean isThere = false;

        for (int number : numbers) {
            if(number == wanted){
                isThere = true;
                break;
            }
        }
        if (isThere) {
            System.out.println(wanted + " is including inside of array.");
        }else {
            System.out.println(wanted + " is not including inside of array.");
        }
    }
}
