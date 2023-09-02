package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] products = new Product[n];

        for ( int i = 0; i < products.length; i++) {
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço: R$ ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        System.out.print("AVG Price: " + Product.avgPrice(products));

        sc.close();
    }
}