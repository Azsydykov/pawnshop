package kg.megacom.services.impl;

import kg.megacom.models.Client;
import kg.megacom.models.Product;
import kg.megacom.services.ProductService;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductServiceImpl implements ProductService {
   public static ArrayList<Product> productList = new ArrayList<>();

    @Override
    public Product createProduct(String name, double price, Client client) {
        Product product = new Product(name, price, client);
        productList.add(product);
        return product;
    }

}
