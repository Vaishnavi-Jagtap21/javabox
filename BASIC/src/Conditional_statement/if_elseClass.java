package Conditional_statement;

import java.util.Scanner;

public class if_elseClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int number=sc.nextInt();
		if(number >5)
		{
			System.out.println(number+" is Larger Than 5.");
		}else {
			System.out.println(number+" is Smaller Than 5.");
		}
      sc.close();
	}

	}


