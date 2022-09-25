package src.oop.ls14ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {18, 25, 30};
        try {   // If inside of the try has a error, catch will run.
            System.out.println(numbers[2]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Logged " + exception);
        }
        finally{   // After run try or catch block, finally will run everytime.
            System.out.println("Finally Block");
        }
    }
}
