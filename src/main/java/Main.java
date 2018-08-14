import entity.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        List<Client> clients =  manager.createQuery("select c from Client c", Client.class).getResultList();
        clients.forEach(System.out::println);
        manager.getTransaction().commit();

        manager.close();
        factory.close();

    }
}
