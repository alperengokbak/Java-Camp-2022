package src.works.work16ThrowDemo;

public class BalanceInSufficentException extends Exception{
    String message;
    public BalanceInSufficentException (String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        
        return this.message;
    }

}
