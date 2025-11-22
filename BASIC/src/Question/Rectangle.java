package Question;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// Rectangle 
		 int length = 5;
	        int breadth = 3;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter The Length : ");
             length=sc.nextInt();
             System.out.println("Enter The Breadth : ");
             breadth=sc.nextInt();
	        int area = length * breadth;
	        int perimeter = 2 * (length + breadth);

	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);

	}

}
