package kg.megacom.services.impl;

import kg.megacom.enums.OperationStatus;
import kg.megacom.models.Operation;
import kg.megacom.models.Product;
import kg.megacom.services.OperationService;
import kg.megacom.services.ProductService;

import java.util.ArrayList;
import java.util.Date;

public class OperationServiceImpl implements OperationService {
    ArrayList<Operation> operationList = new ArrayList<>();
    ProductService productService = ProductService.INSTANCE;

    @Override
    public Operation createOperation(Date startDate, Date endDate, OperationStatus status, ArrayList<Product> products, double totalPrice) {
        Operation operation = new Operation();
        operationList.add(operation);
        for (Product product : products) {
            productService.addProduct(product);
        }
        return operation;
    }

    @Override
    public Double closeOperation(int operationID, Date endDate) {
        Operation operation = operationList.get(operationID);
        double total = 0;
        if (operation.getEndDate() == endDate) {
            total = total * 15;
        } else {
            total = total * 20 * 2;
        }
        operation.setStatus(OperationStatus.CLOSED);
        return total;
    }

}
