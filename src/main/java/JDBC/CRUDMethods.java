package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDMethods {

    static Statement st;
    static Connection cn;

    public static void insert(int id,String name,int salary,String table) throws SQLException {
        try{
            int check = st.executeUpdate("insert into "+table+" values("+id+",'"+name+"',"+salary+")");
            System.out.println((check == 1)?"Row added to table :)":"Something went wrong :(");
        }catch (Throwable t){
            t.printStackTrace();
            System.out.println("Failed at Insertion :(");
        }
    }
    public static void delete(String table,String query) throws SQLException {
        try{
            int check = st.executeUpdate("delete from "+table+" where "+query+"");
            System.out.println((check == 1)?"Row deleted successfully :)":"Something went wrong with deletion :(");
        }catch (Throwable t) {
            System.out.println("Problem with deletion :(");
        }
    }
}
