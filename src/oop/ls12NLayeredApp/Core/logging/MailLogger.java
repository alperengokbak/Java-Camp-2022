package src.oop.ls12NLayeredApp.Core.logging;

public class MailLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Sent the mail: " + data);
    }
    
}
