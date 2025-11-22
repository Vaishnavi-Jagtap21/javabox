package Abstraction;

import java.util.Scanner;

abstract class shape
{
abstract void area();
}
class Circle extends shape
{   
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		int r=sc.nextInt();
		System.out.println(3.14*r*r);
		
	}
}
class Rectangle extends shape
{
	void area()
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of rectangle : ");
		int l=sc.nextInt();
		System.out.println("Enter breath of rectangle : ");
		int b=sc.nextInt();
		System.out.println("Area of rectangle is : "+l*b);
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		// Create a java program having abstract class shape and child 
//		classes circle and rectangle and shape class is having the abstrct 
//		method for finding area()
		Circle c=new Circle ();
		c.area();
		Rectangle r=new Rectangle();
		r.area();
		
		

	}

}
