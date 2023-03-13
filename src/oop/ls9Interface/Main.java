package src.oop.ls9Interface;

public class Main {
    public static void main(String[] args) {    // Classes can implement multiple interfaces
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
