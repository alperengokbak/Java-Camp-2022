package src.works;

public class work9StringDemo {
    public static void main(String[] args) {
        String message = "The most beautiful country is the Canada";
        System.out.println(message);

        System.out.println("Number of the variables: " + message.length());
        System.out.println("Fifth variable: " + message.charAt(4));     // Space is the char at the same time.
        System.out.println(message.concat(" , unfortunately."));    // Concat method combines both of the message each other.
        System.out.println(message.startsWith("B"));    // That method returns true or false. If the message starts with "B" words, return true. Otherwise, return false.
        System.out.println(message.endsWith("."));  // Same as like "startsWith" method. There is just a difference between eachother. That method control the last word and returns true or false.

        char[] characters = new char[3];
        message.getChars(0, 3, characters, 0); // Provided to copy char from message to different char array list.
        System.out.println(message.indexOf('a'));   // That method display the first char between two brackets's index number and starting search from beginning.
        System.out.println(message.lastIndexOf('C')); // That method display the first char between two brackets's index number but there is a difference from "indexof" method. This method starts from the last index and display the first variable between the included variable.
        System.out.println(message.replace("Canada", "Miami"));     // Replace including "String" or "char" with new variable defined data.
        System.out.println(message.substring(2));   // Displaying the code line from defined index inside of between two brackets.
        System.out.println(message.substring(2, 12));   // That time displays area between two defined index.
        
        for(String word : message.split(" ")){      // Split method provide to divide from defined case.
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());      // Allows to make smaller all words.
        System.out.println(message.toUpperCase());      // Allows to make bigger all words.
        System.out.println(message.trim());     // Ignore whole space characters inside of String message.
    }
}
