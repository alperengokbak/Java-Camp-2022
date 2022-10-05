package src.oop.ls12NLayeredApp;

import java.util.ArrayList;

import src.oop.ls12NLayeredApp.Business.ProductManager;
import src.oop.ls12NLayeredApp.Core.logging.DatabaseLogger;
import src.oop.ls12NLayeredApp.Core.logging.FileLogger;
import src.oop.ls12NLayeredApp.Core.logging.Logger;
import src.oop.ls12NLayeredApp.Core.logging.MailLogger;
import src.oop.ls12NLayeredApp.DataAccess.JdbcProductDao;
import src.oop.ls12NLayeredApp.Entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone 11", 18.999);

        ArrayList<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}