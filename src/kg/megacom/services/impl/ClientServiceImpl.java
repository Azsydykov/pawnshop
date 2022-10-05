package kg.megacom.services.impl;

import kg.megacom.exeption.ClientNotFoundExeption;
import kg.megacom.models.Client;
import kg.megacom.services.ClientService;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {
    ArrayList<Client> clientList = new ArrayList<>();


    @Override
    public Client findeCliend(String idCard) {
        for (Client client : clientList) {
            if (client.getIdCard().equals(idCard)) {
                return client;
            }
        }
        throw new ClientNotFoundExeption("Клиент в системе не найден!");
    }

    @Override
    public Client createClient(String name, String idCard) {
        Client client = new Client(name, idCard);
        clientList.add(client);
        return client;
    }

    @Override
    public boolean blockClient(String idCard) {
        Client client = findeCliend(idCard);
        client.setBlocked(true);
        return true;
    }

    @Override
    public void getAllClients() {
        for (Client client : clientList) {
            System.out.println("Clients: " + "Name = " + client.getName() + ", ID = " + client.getId() + ", IDCARD = " +
                    client.getIdCard() + ", BLOCKED = " + client.isBlocked() + ".");

        }
    }
}
