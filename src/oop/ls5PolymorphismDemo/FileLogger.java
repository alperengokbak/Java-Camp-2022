package src.oop.ls5PolymorphismDemo;

public class FileLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to file: " + message);
    }
}
