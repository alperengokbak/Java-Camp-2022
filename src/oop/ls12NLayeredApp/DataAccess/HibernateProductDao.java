package src.oop.ls12NLayeredApp.DataAccess;

import src.oop.ls12NLayeredApp.Entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product) {
        System.out.println("Added inside of database by Hibernate.");
    }
}
