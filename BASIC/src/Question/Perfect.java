package Question;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// Perfect Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
	        int sum = 0;

	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	                sum = sum + i;
	            }
	        }

	        if (sum == num)
	            System.out.println("Perfect Number");
	        else
	            System.out.println("Not Perfect Number");

	}

}
