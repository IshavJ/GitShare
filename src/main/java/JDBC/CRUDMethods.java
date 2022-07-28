package JDBC;

import java.sql.*;

public class CRUDMethods {

    static String url = "jdbc:mysql://localhost:3306/company"; // table details
    static String username = "root"; // MySQL credentials
    static Statement st;
    static Connection con;
    static PreparedStatement ps;

    public static void connection() {
        try {
            con = DriverManager.getConnection(url, username, "");
            System.out.println("Connection Established successfully");
            st = con.createStatement();
        } catch (Throwable t) {
            System.out.println("Connection Closed....");
        }
    }

    public static void insert(String table, int id, String name, int salary) throws SQLException {
        ps = con.prepareStatement("insert into " + table + " values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, salary);
        System.out.println("Row inserted " + ps.executeUpdate());
    }

    public static void delete(String table, String query) throws SQLException {
        try {
            System.out.println((st.executeUpdate("delete from " + table + " where " + query + "") == 1) ? "Row deleted successfully :)" : "Something went wrong with deletion :(");
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Problem with deletion :(");
        }
    }

    public static void display(String table) throws SQLException {
        ResultSet rs = st.executeQuery("select * from " + table + "");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
    }

    public static void update(String table, String query, String condition) throws SQLException {
        System.out.println((st.executeUpdate("update " + table + " set " + query + " where " + condition + "")) == 1?"Row updated :)":"Something went wrong with updation :(");
    }

    public static void terminate() throws SQLException {
        st.close();  // close statement
        con.close(); // close connection
    }

}
