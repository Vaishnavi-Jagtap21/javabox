package Jd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Jd2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/asset_db1";
        String user = "root";               
        String password = "root";  

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT assetId, assetName, purchaseDate, cost FROM assets";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.printf("%-10s %-20s %-15s %-10s%n", 
                              "AssetID", "Asset Name", "Purchase Date", "Cost");
            System.out.println("---------------------------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("assetId");
                String name = rs.getString("assetName");
                String date = rs.getString("purchaseDate");
                double cost = rs.getDouble("cost");

                System.out.printf("%-10d %-20s %-15s %-10.2f%n",
                                  id, name, date, cost);
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error fetching assets!");
            e.printStackTrace();
        }
    }
}
