package Utills;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtills {

    public static SessionFactory buildSessionFactorys() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
