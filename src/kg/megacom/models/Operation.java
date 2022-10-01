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

    public Operation(Date startDate, Date endDate, OperationStatus status, ArrayList<Product> products, double totalPrice) {
        this.id = Math.random();
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public Operation() {
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

}
