package Products.application;

import Products.entities.ImportedProduct;
import Products.entities.Product;
import Products.entities.UsedProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int productAmount = input.nextInt();
        for (int i = 0; i < productAmount; i++) {
            System.out.println("Enter the #" + (i+1) + " product data:");
            System.out.print("Common, used, imported: (C/U/I) ");
            Character productStat = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Price: ");
            double productPrice = input.nextDouble();
            switch (productStat.toString().toLowerCase()) {
                case "c":
                    products.add(new Product(productName, productPrice));
                    break;
                case "u":
                    System.out.print("Manufacture date: ");
                    input.nextLine();
                    String productManufactureDate = input.nextLine();
                    products.add(new UsedProduct(productName, productPrice, productManufactureDate));
                    break;
                case "i":
                    System.out.print("Custom's fee: ");
                    double productCustomFee = input.nextDouble();
                    products.add(new ImportedProduct(productName, productPrice, productCustomFee));
                    break;
                default:
                    break;
            }

        }
        System.out.println();
        System.out.println("Price tags:");
        for (Product product: products) {
            System.out.println(product.toString());
        }

        input.close();
    }
}
