package kg.megacom.services.impl;

import kg.megacom.models.Product;
import kg.megacom.services.ProductService;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductServiceImpl implements ProductService {

    ArrayList<Product> productList = new ArrayList<>();


    @Override
    public Product createProduct(String name, double price) {
        Product product = new Product(name, price);
        productList.add(product);
        return product;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void getAllProducts() {
        for (Product product : productList) {
            System.out.println("Products: " + "Name = " + product.getName() + ", price = " + product.getPrice() + ".");
        }
    }

    @Override
    public double getTotalPrice(ArrayList<Product> products) {
        double totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();

        }
        return totalPrice;
    }
}
