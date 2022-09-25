package src.oop.ls16ThrowDemo;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Account Balance: " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Account Balance: " + accountManager.getBalance());
        try {
            accountManager.withdrawal(40);
        } catch (BalanceInSufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Account Balance: " + accountManager.getBalance());
        try {
            accountManager.withdrawal(70);
        } catch (BalanceInSufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Account Balance: " + accountManager.getBalance());
    }
}
