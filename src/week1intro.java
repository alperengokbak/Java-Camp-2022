package src;

public class week1intro {
    public static void main(String[] args) {
        // Variables is written with camelCase. camelCase meaning is the first letter of word is small, second letter of word is written big.
        String middleText = "You may be interested";
        String bottomText = "Term time";

        System.out.println(middleText);
        System.out.println(bottomText);

        // Int is using with integer.
        int term = 12;
        System.out.println(term);

        // Double type's using with decimal numbers.
        double dollarYesterday = 18.10;
        double dollarToday = 18.10;

        boolean dollarIsDecreased = false;

        if (dollarYesterday > dollarToday) {
            dollarIsDecreased = true;
            System.out.println("Dollar is decreased: " + dollarIsDecreased);
        } else if(dollarYesterday < dollarToday){
            dollarIsDecreased = false;
            System.out.println("Dollar is decreased: " + dollarIsDecreased);
        } else{
            System.out.println("There is not any changing in dollar exchange rate between yesterday and today.");
        }

        // Arrays and For Loops
        int[] credits = {18 , 25 , 30};
        
        for(int i = 0; i < credits.length; i++){
            System.out.println(credits[i]);
        } 
    }
}