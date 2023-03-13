package src.oop.ls5PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
        /*BaseLogger[] loggers = {new FileLogger(), new EmailLogger(), new DataBaseLogger()};

        for (BaseLogger baseLogger : loggers) {
            baseLogger.Log("Log Message");
        }*/

        CustomerManger customerManger = new CustomerManger(new FileLogger());
        customerManger.add();
    }
}
