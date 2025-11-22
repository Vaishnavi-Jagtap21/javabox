package Operators;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// Logical Operators
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number");
        int a=sc.nextInt();
        System.out.print("Enter 2st Number");
        int b=sc.nextInt();
        System.out.print("Enter 3st Number");
        int c=sc.nextInt();
        System.out.println("(a<b and b<c) : "+(a<b && b<c));
        System.out.println("(a<b OR b<c) : "+(a<b || b<c));
        System.out.println("(Not b<c) : "+!(b<c));
        
	}

}
