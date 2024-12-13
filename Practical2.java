class Product {
    int productId;
    String productName;
    double price;
    static int count = 0;

    Product() {
        this.productId = 0;
        this.productName = null;
        this.price = 0.0;
    }

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        count++;
    }

    double discount(double discountPercentage) {
        return ((100 - discountPercentage) / 100) * this.price;
    }

    void displayProductInfo() {
        System.out.println("Product Id : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Product Price : " + price);
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(202, "Smart Phone", 499.95);
        Product product3 = new Product(303, "Tablet", 299.50);

        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        double discountedPrice = product1.discount(10);
        System.out.println("Discounted Price :"+discountedPrice);
        System.out.println(Product.count);
    }
}
