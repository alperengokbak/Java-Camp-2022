package src.oop.ls7AbstractClasses;

public class Main {
    public static void main(String[] args) {
        //GameCalculator[] gameCalculators = new GameCalculator[] {new ManGameCalculator(), new WomanGameCalculator(), new KidsGameCalculator()};

        GameCalculator gameCalculator = new WomanGameCalculator();

        gameCalculator.calculate();
    }
}
