package kg.megacom.models;

import kg.megacom.enums.OperationStatus;

import java.util.ArrayList;
import java.util.Date;

public class Operation {
    private double id;
    private Date startDate;
    private Date endDate;
    private OperationStatus status;
    private ArrayList<Product> products;
    private double totalPrice;
    private Client client;
    private int diffDay;
    private double overPayment;




    public Operation(Date endDate, ArrayList<Product> products, double totalPrice, Client client) {
        this.id = Math.random();
        this.startDate = new Date();
        this.endDate = endDate;
        this.status = OperationStatus.OPEN;
        this.products = products;
        this.totalPrice = totalPrice;
        this.client = client;
    }

    public Operation(int diffDay,Date endDate, ArrayList<Product> products, double totalPrice, Client client, double overPayment) {
        this.id = Math.random();
        this.startDate = new Date();
        this.endDate = endDate;
        this.status = OperationStatus.OPEN;
        this.products = products;
        this.totalPrice = totalPrice;
        this.client = client;
        this.overPayment = overPayment;
        this.diffDay = diffDay;

    }

    public Operation() {

    }

    public double getOverPayment() {
        return overPayment;
    }

    public void setOverPayment(double overPayment) {
        this.overPayment = overPayment;
    }

    public int getDiffDay() {
        return diffDay;
    }

    public void setDiffDay(int diffDay) {
        this.diffDay = diffDay;
    }

    public double getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
