package src.opp.ls4InheritanceIntro;

public class mainClass {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        employee.salary = 12.999;
        customer.id = 12;

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.BestEmployee();
        customerManager.Add();
    }
}
