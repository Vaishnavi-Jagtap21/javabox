package Interfaces;

import java.util.Scanner;

interface shape
{
	public void area();
	final float pi=3.14f;
}
class Triangle implements shape
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of triangle : ");
		int base=sc.nextInt();
		System.out.println("Enter Height of triangle : ");
		int height=sc.nextInt();
		int area=(base * height )/2;
		System.out.println("Area OF Triangle : "+area);
	}
}
class Circle implements shape
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		float radius=sc.nextInt();
		float area=pi*radius*radius;
		System.out.println("Area OF Circle : "+area);
	}
}
class Rectangle implements shape
{
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of Rectangle : ");
		int base=sc.nextInt();
		System.out.println("Enter width of Rectangle : ");
		int height=sc.nextInt();
		int area=base * height ;
		System.out.println("Area OF Rectangle : "+area);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		t.area();
		r.area();
		c.area();
		System.out.println(t.pi);

	}

}
