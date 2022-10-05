package kg.megacom;

import kg.megacom.enums.OperationStatus;
import kg.megacom.exeption.ClientNotFoundExeption;
import kg.megacom.models.Client;
import kg.megacom.models.Operation;
import kg.megacom.models.Product;
import kg.megacom.services.ClientService;
import kg.megacom.services.OperationService;
import kg.megacom.services.ProductService;
import kg.megacom.services.impl.OperationServiceImpl;
import sun.util.resources.lt.CalendarData_lt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        ClientService clientService = ClientService.INSTANCE;
        ProductService productService = ProductService.INSTANCE;
        OperationService operationService = OperationService.INSTANCE;

        Client client;
        try {
            client = clientService.findeCliend("id12345");
        } catch (ClientNotFoundExeption e) {
            client = clientService.createClient("Azamat", "id12345");
        }
        //  clientService.getAllClients();

        ArrayList<Product> products = new ArrayList<>();
        products.add(productService.createProduct("Iphone 11pro", 10000, client));
        products.add(productService.createProduct("TV SAMSUNG", 10000, client));
        products.add(productService.createProduct("watch", 10000, client));

        operationService.createOperation(15, products, client);

        operationService.getOperationByIdCard("id12345");


        operationService.closeOperation("25.10.2022 21:36:12", products, client);

        operationService.getFinalOperationByIdCard("id12345");


    }
}
