package task2;

import task2.dao.ClientDAO;
import task2.dao.DAOFactory;
import task2.dao.IDAOFactory;
import task2.entity.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IDAOFactory factory = DAOFactory.getInstance();


        ClientDAO clientsDao = factory.getClientDAO();

        Client client = new Client();
        client.setName("Тест");
        client.setAge(24);
        client.setPhone("0997747511");
        clientsDao.addClient(client);

        List<Client> clients = clientsDao.getAllClient();
        for (Client client1 : clients) {
            System.out.println(client1.getId() + " " + client1.getName() + " " + client1.getAge() + " " + client1.getPhone());
        }

        Client client_2 = clientsDao.getById(3);
        System.out.println(client_2.getId() + " " + client_2.getName() + " " + client_2.getAge() + " " + client_2.getPhone());

        clientsDao.updateAge(32,1);

        clientsDao.remove("Тест");
    }
}
