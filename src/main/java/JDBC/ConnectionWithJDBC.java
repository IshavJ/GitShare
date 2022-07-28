package JDBC;

import java.sql.SQLException;

import static JDBC.CRUDMethods.*;

public class ConnectionWithJDBC {

    public static void main(String args[]) throws SQLException {
        connection();
        insert("employee", 78, "Perry", 90000);
        delete("employee", "id = 5");
        update("employee","emp_name = 'Rachel'","id = 78");
        display("employee");
        terminate();
    }
}
