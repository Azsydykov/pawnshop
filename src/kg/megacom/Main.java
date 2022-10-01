package kg.megacom;

import kg.megacom.enums.OperationStatus;
import kg.megacom.exeption.ClientNotFoundExeption;
import kg.megacom.models.Client;
import kg.megacom.models.Operation;
import kg.megacom.models.Product;
import kg.megacom.services.ClientService;
import kg.megacom.services.OperationService;
import kg.megacom.services.ProductService;
import sun.util.resources.lt.CalendarData_lt;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdformat = new SimpleDateFormat("dd.MM.yyyy");

        ClientService clientService = ClientService.INSTANCE;
        ProductService productService = ProductService.INSTANCE;
        OperationService operationService = OperationService.INSTANCE;

        Client client;
        try {
            client = clientService.findeCliend("id12345");
        } catch (ClientNotFoundExeption e) {
            clientService.createClient("Azamat", "id12345");
            clientService.createClient("Marat", "id54321");
        }
        //   clientService.getAllClients();

        //  productService.createProduct("Телевизор", 15000);
        //  productService.createProduct("Мобильный телефон", 25000);
        //  productService.getAllProducts();

        //sdasd
        //sadsad

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Телевизор", 15000));
        products.add(new Product("Мобильный телефон", 25000));

        operationService.createOperation(new Date(), new Date(), OperationStatus.OPEN,
                products, productService.getTotalPrice(products));




    }
}
