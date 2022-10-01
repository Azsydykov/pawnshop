package kg.megacom.services;

import kg.megacom.enums.OperationStatus;
import kg.megacom.models.Operation;
import kg.megacom.models.Product;
import kg.megacom.services.impl.OperationServiceImpl;

import java.util.ArrayList;
import java.util.Date;

public interface OperationService {
    OperationService INSTANCE = new OperationServiceImpl();

    Operation createOperation (Date startDate,Date endDate, OperationStatus status,ArrayList<Product> products, double totalPrice);
    Double closeOperation (int operationID, Date endDate);

}