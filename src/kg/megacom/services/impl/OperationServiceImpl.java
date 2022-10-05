package kg.megacom.services.impl;

import kg.megacom.models.Client;
import kg.megacom.models.Operation;
import kg.megacom.models.Product;
import kg.megacom.services.OperationService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class OperationServiceImpl implements OperationService {
    ArrayList<Operation> operationList = new ArrayList<>();

    @Override
    public Operation createOperation(int days, ArrayList<Product> products, Client client) {

        Calendar endaDate = Calendar.getInstance();
        endaDate.add(Calendar.DAY_OF_MONTH, days);
        double totalPrice = getTotalPrice(products, days);

        Operation operation = new Operation(endaDate.getTime(), products, totalPrice, client);
        operationList.add(operation);
        return operation;
    }

    @Override
    public Operation closeOperation(String closeDate1, ArrayList<Product> products, Client client) throws ParseException {

        for (Operation operation : operationList) {
            if (client.getIdCard().equals(operation.getClient().getIdCard())) {


                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                Date closeDate = sdf.parse(closeDate1);
                Date endDate = operation.getEndDate();
                Date starDate = operation.getStartDate();

                int millSec = (int) (endDate.getTime() - starDate.getTime());
                int days = millSec / (1000 * 60 * 60 * 24);

                int diffMillS = (int) (closeDate.getTime() - endDate.getTime());
                int diffDay = diffMillS / (1000 * 60 * 60 * 24);
                int overPayment = 0;
                if (diffDay > 0) {
                    overPayment = (int) getOverTotalPrice(products, diffDay);
                }

                double totalPrice = getTotalPrice(products, days);
                Operation closeOperation = new Operation(diffDay, closeDate, products, totalPrice, client, overPayment);
                operationList.add(closeOperation);
                return closeOperation;
            }
            return operation;

        }
        return null;
    }

    double getOverTotalPrice(ArrayList<Product> products, int diffDay) {
        int overPayment = 0;
        for (Product product : products) {
            overPayment += product.getPrice();
        }

        return overPayment * diffDay / 50;
    }

    double getTotalPrice(ArrayList<Product> products, int days) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice + (totalPrice * days / 100);
    }

    @Override
    public void getFinalOperationByIdCard(String idCard) {
        for (Operation operation : operationList) {
            if (operation.getClient().getIdCard().equals(idCard)) {
                System.out.println("OperationId = " + operation.getId() +
                        ", StartDate = " + operation.getStartDate() + ", EndDate = " + operation.getEndDate() +
                        ", daysOverdue = " + operation.getDiffDay() +
                        ", totalPrice = " + operation.getTotalPrice() + ", overPayment = " + operation.getOverPayment() + ".");
            }
        }
    }

    @Override
    public void getOperationByIdCard(String idCard) {
        for (Operation operation : operationList) {
            if (operation.getClient().getIdCard().equals(idCard)) {
                System.out.println("OperationId = " + operation.getId() + ", ClientName = " + operation.getClient().getName() +
                        ", StartDate = " + operation.getStartDate() + ", EndDate = " + operation.getEndDate() +
                        ", totalPrice = " + operation.getTotalPrice() + ".");
            }
        }
    }
}



