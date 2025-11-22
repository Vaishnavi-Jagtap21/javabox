package Conditional_statement;

import java.util.Scanner;

public class NestedIfClass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Username : ");
	String username=sc.nextLine();
	if(username.equals("Vaishu@123"))
	{
		System.out.println("Enter The Password : ");
		String pass=sc.next();
		if(pass.equals("Oppok13"))
		{
			System.out.println("Hello " +username+ "Successfully Login To Your Profile ");
		}
		else {
			System.out.println("Invalid Password");
		}
		
	}else {
		System.out.println("Invalid Username Please Try Again");
	} sc.close();
	
	}

}
