package src.oop.ls5PolymorphismDemo;

public class DataBaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to data base: " + message);
    }
}
