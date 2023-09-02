package entities;

public class Product {
    private String name;
    private double price;

    public Product() {
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static double avgPrice(Product[] products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum / products.length;
    }
}
