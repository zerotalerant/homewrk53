package Applicaiton;

import Entity.Users;
import org.hibernate.Session;

public class Application {
    public static void main(String[] args) {
        Users users = new Users ();
        public static Integer create(Users users) {
            Session session = HibernateUtil.getSessionFactory().OpenSession();
            session.beginTransaction();
            session.save(users);
            session.getTransaction().commit();
            session.close();
            System.out.println("Успешно создан" + users.toString());
            return users.getId;

        }
    }
}
