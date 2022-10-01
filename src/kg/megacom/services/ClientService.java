package kg.megacom.services;

import kg.megacom.models.Client;
import kg.megacom.services.impl.ClientServiceImpl;

public interface ClientService {
    ClientService INSTANCE = new ClientServiceImpl();

    Client findeCliend(String idCard);
    Client createClient (String name, String idCard);
    boolean blockClient (String idCard);
    void getAllClients();




}
