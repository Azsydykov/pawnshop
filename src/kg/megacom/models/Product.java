package kg.megacom.models;

public class Product {
    private double id;
    private String name;
    private double price;
    private Client client;


    public Product(String name, double price, Client client) {
        this.name = name;
        this.price = price;
        this.client = client;
        this.id = Math.random();
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
