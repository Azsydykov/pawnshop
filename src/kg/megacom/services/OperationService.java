package kg.megacom.services;

import kg.megacom.models.Client;
import kg.megacom.models.Operation;
import kg.megacom.models.Product;
import kg.megacom.services.impl.OperationServiceImpl;

import java.text.ParseException;
import java.util.ArrayList;

public interface OperationService {
    OperationService INSTANCE = new OperationServiceImpl();

    Operation createOperation(int days, ArrayList<Product> products, Client client);

    Operation closeOperation(String currentDate, ArrayList<Product> products, Client client) throws ParseException;

    void getOperationByIdCard(String idCard);
    void getFinalOperationByIdCard(String idCard);

}