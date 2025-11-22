package Question;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();   // change the number
        boolean prime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Number Is Prime ");
        else
            System.out.println("Number Is Not  Prime");

	}

}
