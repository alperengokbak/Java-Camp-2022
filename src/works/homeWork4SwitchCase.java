package src.works;

public class homeWork4SwitchCase {
    //  The code formatting is available in Visual Studio Code through the following shortcuts: "On Windows Shift + Alt + F."
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Awsome!! You passed that lesson easily.");
                break;
            case 'B':
                System.out.println("You passed that lesson.");
                break;
            case 'C':
                System.out.println("Passed.");
                break;
            case 'F':
                System.out.println("Your average is not enough to pass the lesson.");
                break;

            default:
                System.out.println("Invalid value!!");
                break;
        }
    }
}
