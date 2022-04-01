package Applicaiton;

import Entity.*;
import Utills.HibernateUtills;
import org.hibernate.Session;

import java.util.Objects;

public class Application {
    private static final Session hibernateSession =
            Objects.requireNonNull ( HibernateUtills.
                            buildSessionFactorys () ).
                    openSession ();


    public static void main ( String[] args )
    {
        hibernateSession.beginTransaction ();

        Product product = Product.builder ().name ( "Potato" ).price ( 200 ).fresh ( "Fresh potato, only today" ).build ();
        User user = User.builder ().login ( "sasha2442" ).password ( "2332" ).email ( "anton23@mail.com" ).build ();
        Basket basket = Basket.builder ().product ( product ).user ( user ).build ();
        Category category = Category.builder ().name ( "Vegetable" ).build ();
        ProductCategory productCategory = ProductCategory.builder ().product ( product ).categories ( category ).build ();

        hibernateSession.save ( product );
        hibernateSession.save ( user );
        hibernateSession.save ( basket );
        hibernateSession.save ( category );
        hibernateSession.save ( productCategory );

        hibernateSession.getTransaction ().commit ();
        hibernateSession.close ();
    }
}
