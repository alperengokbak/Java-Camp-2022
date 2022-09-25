package src.works.work12ArrayListDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Alperen", "Gökbak"));
        customers.add(new Customer(2, "Emine", "Timur"));
        Customer ali = (new Customer(3, "Ali", "Veli"));
        customers.add(ali);

        customers.remove(ali);
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}
