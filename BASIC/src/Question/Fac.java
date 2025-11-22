package Question;

import java.util.Scanner;

public class Fac {

	public static void main(String[] args) {
		// Factorial
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int a=sc.nextInt();
		int fac=1;
		for(int i=1;i<=a;i++)
		{
			
			fac=fac*i;
		}
		System.out.println("Factorial of "+a+" is "+fac);
	}

}
