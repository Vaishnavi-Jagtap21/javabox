package Question;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		// Palindrome
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt(); // change number to test
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

	}

}
