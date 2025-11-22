package Question;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// Perimeter And Area Circle
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius : ");
		double r=sc.nextInt();
		double a=Math.PI*r*r;
		double p=2*Math.PI*r;
		System.out.println("Area Of Circle : "+a);
        System.out.println("Perimeter of Circle : "+p);		


	}

}
