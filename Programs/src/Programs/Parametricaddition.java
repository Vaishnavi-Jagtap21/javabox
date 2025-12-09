package Programs;

import java.util.Scanner;

class myclass
{
	private int c;
	public void add(int a,int b)
	{
	    c=a+b;
		System.out.println("Addition of "+a+" And "+b+" Is : "+c);
	}
}
public class Parametricaddition {

	public static void main(String[] args) {
		//Addition parametric addition
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number for Addition : ");
		a=sc.nextInt();
		System.out.println("Enter Second Number for Addition : ");
		b=sc.nextInt();
        myclass m=new myclass();
        m.add(a, b);
        sc.close();
	}

}
