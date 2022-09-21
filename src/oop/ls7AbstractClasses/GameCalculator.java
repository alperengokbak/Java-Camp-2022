package src.oop.ls7AbstractClasses;

public abstract class GameCalculator {
    public abstract void calculate();   // Abstract class imposes an obligation override the method inside of each class, each class implement the methods by themselves. At the same time which class extended "GameCalculator" class, have to keep that abstract method.
    
    public final void gameOver(){
        System.out.println("Game over, try again.");
    }
}
