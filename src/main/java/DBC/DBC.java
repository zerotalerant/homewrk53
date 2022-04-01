package DBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
    private static final String url = "jdbc:postgresql://localhost:5433/postgres";
    private static final String user = "postgres";
    private static final String password = "master";

    public static Connection connect ()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection ( url, user, password );
            System.out.println ( "Успешно законектились!" );
        } catch (SQLException exception)
        {
            System.out.println ( exception.getMessage () );
        }
        return connection;
    }
}
