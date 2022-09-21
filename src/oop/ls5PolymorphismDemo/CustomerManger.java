package src.oop.ls5PolymorphismDemo;

public class CustomerManger {
    private BaseLogger baseLogger;

    public CustomerManger(BaseLogger logger){
        this.baseLogger = logger;
    }
    public void add(){
        System.out.println("Added Customer!");
        this.baseLogger.log("Log message");
    }
}
