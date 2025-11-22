package Question;

import java.util.Scanner;

public class Reverse
{

	public static void main(String[] args)
	{
		// Reverse
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
        int rev = 0;

        while (num > 0) 
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + rev);

	}

}
