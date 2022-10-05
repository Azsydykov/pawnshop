package kg.megacom.models;

public class Client {
    private double id;
    private String name;
    private String idCard;
    private boolean blocked;


    public Client(String name, String idCard) {
        this.id = id;
        this.name = name;
        this.idCard = idCard;
        this.blocked = blocked;
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
}
