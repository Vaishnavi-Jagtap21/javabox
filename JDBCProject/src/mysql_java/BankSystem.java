package mysql_java;
import java.util.*;
public class BankSystem {
	
	//1.Connection to Database
	public static Connection getconnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jbdc:mysql://localhost:3306/bankdbms";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	//2.create table
	public static void createTable()
	{
		try {
			 Connection con=getConnection();
			 String q="CREATE TABLE IF NOT EXISTS bank("
			 		+ "acc_no INT PRIMARY KEY, "
					+"name VARCHAR(100),"
			 		+"balanace DOUBLE,"
					+"email VARCHAR(100),"
			 		+"phone VACHAR(15))";
			 Statement st =con.createStatement();
			 st.executeUpdate(q);
			 System.out.println("Table ready");
			 con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
					 
		}
	}
	//3.insert record
	public static void insertRecord()
	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter account number :  ");
			int acc=sc.nextInt();
			System.out.println("Enter Name :");
			String name=sc.next();
			System.out.println("Enter Balance : ");
			double bal=sc.nextDouble();
			System.out.println("Enter email");
			String emai=sc.next();
			System.out.println("Enter phone : ");
			String phone=sc.next();
			
			Connection con=getConnection();
			String q="Insert Into bank  VALUES(?,?,?,?,?)"
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
