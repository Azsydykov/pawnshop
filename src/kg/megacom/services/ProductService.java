package kg.megacom.services;

import kg.megacom.models.Client;
import kg.megacom.models.Product;
import kg.megacom.services.impl.ProductServiceImpl;

import java.util.ArrayList;

public interface ProductService {
    ProductService INSTANCE = new ProductServiceImpl();
    Product createProduct(String name, double price, Client client);

}
