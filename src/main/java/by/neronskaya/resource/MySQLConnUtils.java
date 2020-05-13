package by.neronskaya.resource;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
    private static Connection connection;
    final static Logger logger = Logger.getLogger(MySQLConnUtils.class);

    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "roomsdb";
        String userName = "root";
        String password = "8008";
        logger.info("connection with db");
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password)
            throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        connection = DriverManager.getConnection(connectionURL, userName,
                password);
        return connection;
    }

    public static void disconnect() throws SQLException {
        if (connection != null && connection.isClosed()) {
            connection.close();
        }
        logger.info("disconnect with db");
    }
}
