package src.oop.ls11StaticDemo;

public class ProductManager {
    public void Add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("Product Added.");
        }else{
            System.out.println("Product not invalid.");
        }
    }
}
