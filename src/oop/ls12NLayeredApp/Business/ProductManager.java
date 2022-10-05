package src.oop.ls12NLayeredApp.Business;

import java.util.List;

import src.oop.ls12NLayeredApp.Core.logging.Logger;
import src.oop.ls12NLayeredApp.DataAccess.ProductDao;
import src.oop.ls12NLayeredApp.Entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;
    
    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // These codes are not the clean code, It will be better step by step.
        // Bussines Rules.
        if(product.getUnitPrice() < 10){
            throw new Exception("Cost of product cannot be less than 10.");
        }
        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
