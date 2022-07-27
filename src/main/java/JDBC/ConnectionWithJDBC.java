package JDBC;

import java.sql.*;

import static JDBC.CRUDMethods.insert;

public class ConnectionWithJDBC {
    static String url = "jdbc:mysql://localhost:3306/company"; // table details
    static String username = "root"; // MySQL credentials
    static String query = "select * from department"; // query to be run
    static Statement st;
    static ResultSet rs;

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        try{
            Connection con = DriverManager.getConnection(url,username,"");
            System.out.println("Connection Established successfully");
            st = con.createStatement();
            insert(5,"Jai",40000,"employee");
            //delete("employee","id = 5");
            con.close(); // close connection
        } catch (Throwable t){
            System.out.println("Connection Closed....");
        }
    }
}
