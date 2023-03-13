package src.oop.ls3ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Msi Laptop", "Laptop", 12.999, 24, "Black");
        ProductManager productManager = new ProductManager();

        System.out.println(product.getId());
        productManager.Add(product);
    }
}
