package src.works;

public class homeWork6Arrays {
    public static void main(String[] args) {
        // A dimensional array is writting that types.

        // One of them is:
        String students[] = {"Emine" , "Alperen" , "Suat"};

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();

        // Other one is:
        String citys[] = new String[3];
        citys[0] = "Miami";
        citys[1] = "Berlin";
        citys[2] = "Copenhagen";

        // Foreach Loops
        for (String city : citys) {
            System.out.println(city);
        }
    }
}
