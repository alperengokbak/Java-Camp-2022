package src.oop.ls6Overriding;

public class BaseCreditManager {
    public final double calculate(double amount){   // "final" keyword meanning is you must not change value inside of anywhere, you can only use first value of method.
        return amount * 1.18;
    }
}
