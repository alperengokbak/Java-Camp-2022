package src.oop.ls11StaticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product(1, "Laptop", 11.99);
        productManager.Add(product);

        DatabaseHelper.Crud.Add();
    }
}
