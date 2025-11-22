package Question;

import java.util.Scanner;

public class Sumofalldigi 
{

	public static void main(String[] args) 
	{
		// Sum of Digit means adding each digit of a number together
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		long n = sc.nextLong();
		long sum = 0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println("Sum of Digits : "+sum);

	}

}
