package Jd3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jd3 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/asset_db1"; 
        String user = "root";               
        String password = "root";           

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Asset ID to delete: ");
        int assetId = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "DELETE FROM assets WHERE assetId = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, assetId);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Asset deleted successfully!");
            } else {
                System.out.println("No asset found with ID: " + assetId);
            }
            pstmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error deleting asset!");
            e.printStackTrace();
        }

        sc.close();
    }
}
