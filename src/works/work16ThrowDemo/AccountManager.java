package src.works.work16ThrowDemo;

public class AccountManager {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdrawal(double amount) throws BalanceInSufficentException{
        if(balance >= amount){
            this.balance -= amount;
        } else {
            throw new BalanceInSufficentException ("Insufficient Balance.");
        }
    }
}
