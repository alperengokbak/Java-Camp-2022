package src.oop.ls11StaticDemo;

public class ProductValidator {
    Product product;
    public static boolean isValid(Product product){
        if(product.getPrice() > 0 && !product.getName().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
