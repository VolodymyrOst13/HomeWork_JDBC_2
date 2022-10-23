package task2.dao;

public class ClientDAO {
    oid addClient(Client client);

    List<Client> getAllClient ();

    Client getById(int id);

    void updateAge(int age, int id);

    void remove(String name);
}
