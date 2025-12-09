package Programs;

import java.util.Scanner;

public class Pro16 {

	public static void main(String[] args) {
		// Palindrome or not
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (temp == rev)
        	System.out.println(temp + " is a palindrome number");
        else System.out.println(temp + " is not a palindrome number");
        sc.close();
	}

}
