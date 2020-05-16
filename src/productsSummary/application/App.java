package productsSummary.application;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File file = new File("/home/guilherme/IdeaProjects/CursoJava/src/productsSummary/entities/products.csv");
        Scanner products;
        String product;
        ArrayList<String> productsEdited = new ArrayList<>();
        String productName;
        Double productPrice;
        int productQuantity;

        try {
            products = new Scanner(file);
            while (products.hasNextLine()) {
                product = products.nextLine();
                productName = product.split(",")[0];
                productPrice = Double.valueOf(product.split(",")[1]);
                productQuantity = Integer.valueOf(product.split(",")[2]);
                productsEdited.add(productName + ", total value: " + (productPrice * productQuantity));
            }
        } catch (FileNotFoundException reject) {
            reject.printStackTrace();
        }
        String path = "/home/guilherme/IdeaProjects/CursoJava/src/productsSummary/entities/EditedProducts.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for (String productEdited : productsEdited) {
                writer.write(productEdited);
                writer.newLine();
            }
        } catch (IOException reject) {
            reject.printStackTrace();
        }
    }
}
