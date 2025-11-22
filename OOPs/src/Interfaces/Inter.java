package Interfaces;

import java.util.Scanner;

interface multi
{   
	public abstract void area();
	final int base=12;
	final int height=10;
	final int bredth=10;
	final int length=10;
	final float pi=3.14f;
	final float radius=3.14f;
	final int side=3;
}
class Tri implements multi
{
	public void area()
	{
		int area=(base * height )/2;
		System.out.println("Area OF Triangle : "+area);
	}
}
class Rec implements multi
{
	public void area()
	{
		int area=(base * height )/2;
		System.out.println("Area OF Triangle : "+area);
	}
}
class Cir implements multi
{
	public void area()
	{
		
		float area=pi*radius*radius;
		System.out.println("Area OF Circle : "+area);
	}
}
class Square implements multi
{
	public void area()
	{
	    float area=side*side;
		System.out.println("Area OF Square: "+area);
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri t=new Tri();
		t.area();
		Rec r=new Rec();
		r.area();
		Cir c=new Cir();
		c.area();
		Square s=new Square();
		s.area();
		System.out.println(s.side*s.side);
		

	}

}
