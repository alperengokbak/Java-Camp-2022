package src.oop.ls12NLayeredApp.Core.logging;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Logged the file: " + data);
    }
    
}
