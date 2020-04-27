package by.neronskaya.resource;

import javax.servlet.ServletRequest;
import java.sql.Connection;

public class MyUtils {
    public static final String NAME_CONNECTION = "ATTRIBUTE FOR CONNECTION";

    public static Connection getStoredConnection(ServletRequest request) {
        Connection connection = (Connection) request.getAttribute(NAME_CONNECTION);
        return connection;
    }


}
