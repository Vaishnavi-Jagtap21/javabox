package Encapsulation;

import java.util.Scanner;

class side
{
	private int side;
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	int area()
	{
	return(side*side);
	}

}
public class Square {

	public static void main(String[] args) {
		// Area of Perimeter of Square
		Scanner sc=new Scanner(System.in);
		side st=new side();
		System.out.println(st.getSide());
		System.out.println("Area Of Square is :"+st.area());

	}

}
