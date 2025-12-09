package Jd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jd1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/asset_db1";
        String user = "root";                
        String password = "root";   
        String assetName = "Laptop";
        String purchaseDate = "2024-01-10";
        double cost = 55000.00;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO asset (assetName, purchaseDate, cost) VALUES (?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, assetName);
            pstmt.setString(2, purchaseDate);
            pstmt.setDouble(3, cost);
            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Asset added successfully!");
            }
            pstmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error inserting asset!");
            e.printStackTrace();
        }
    }
}
