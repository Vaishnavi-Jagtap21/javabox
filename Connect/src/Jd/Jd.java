package Jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jd {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/asset_db"; 
        String user = "root";                 
        String password = "root";     

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}
