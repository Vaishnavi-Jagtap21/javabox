package Conditional_statement;

import java.util.Scanner;

public class ElseIfClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int number=sc.nextInt();
		if(number >5)
		{
			System.out.println(number+" is Greater Than 5.");
		}
		else if(number <5)
		{
			System.out.println(number +"is Less Than 5 ");
		}else {
			System.out.println(number +"is Equal To 5");
		}
       sc.close();
	}

}
