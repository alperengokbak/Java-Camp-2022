package src.works;
import java.util.*;;

public class project2Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valid vowel: ");
        char definedLetter = sc.next().charAt(0);

        switch (definedLetter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Defined the letter is bold vowel.");
                break;
            default:
                System.out.println("Defined the letter is slender vowel.");
                break;
        }
        sc.close();
    }
}
