package Operators;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// Relational Operators
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number");
        int num1=sc.nextInt();
        System.out.print("Enter 2st Number");
        int num2=sc.nextInt();
        System.out.println(num1+"=="+num2+":"+(num1==num2));
        System.out.println(num1+"!="+num2+":"+(num1!=num2));
        System.out.println(num1+"<"+num2+":"+(num1<num2));
        System.out.println(num1+">"+num2+":"+(num1>num2));
        System.out.println(num1+">="+num2+":"+(num1>=num2));
        System.out.println(num1+"<="+num2+":"+(num1<=num2));
        
      sc.close();  
	}


}
