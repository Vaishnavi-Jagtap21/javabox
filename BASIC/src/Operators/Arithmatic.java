package Operators;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		// Arithmatic Operators
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number");
        int num1=sc.nextInt();
        System.out.print("Enter 2st Number");
        int num2=sc.nextInt();
        System.out.println("Addition of "+num1+" And "+num2+" is "+(num1+num2));
        System.out.println("Substraction of "+num1+" And "+num2+" is "+(num1-num2));
        System.out.println("Multiplication of "+num1+" And "+num2+" is "+(num1*num2));
        System.out.println("Division of "+num1+" And "+num2+" is "+(num1/num2));
        System.out.println("Remainder of "+num1+" is divided by  "+num2+" is "+(num1%num2));
        sc.close();
   }

}
