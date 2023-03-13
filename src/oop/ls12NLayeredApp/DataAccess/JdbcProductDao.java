package src.oop.ls12NLayeredApp.DataAccess;

import src.oop.ls12NLayeredApp.Entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        // Only db acceses codes writting over there...(SQL)
        // After many years, we decided to change Hibernate. There are so many code lines type of JDBC
        System.out.println("Added inside of database by JDBC.");
    }
}
