package kg.megacom.models;

public class Client {
    private double id;
    private String idCard;
    private boolean blocked;
    private String name;

    public Client(String idCard, String name) {
        this.id = Math.random();
        this.idCard = idCard;
        this.blocked = blocked;
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
