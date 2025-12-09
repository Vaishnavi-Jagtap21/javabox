package Programs;
import java.util.*;
class program1
{
	private int c;
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println(a+" And "+b+" Addition is : "+c);
	}
}
class program2
{
	private int c;
	public void sub(int a,int b)
	{
		c=a-b;
		System.out.println(a+" And "+b+" Substraction is : "+c);
	}
}
class program3
{
	private int c;
	public void mul(int a,int b)
	{
		c=a*b;
		System.out.println(a+" And "+b+" Multiplication is : "+c);
	}
}
class program4
{
	private int c;
	public void div(int a,int b)
	{
		c=a/b;
		System.out.println(a+" And "+b+" Division is : "+c);
	}
}
public class Pro5 {

	public static void main(String[] args) {
		//Special function and special class
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		x=sc.nextInt();
		y=sc.nextInt();
		program1 p1=new program1();
		p1.add(x, y);
		program2 p2=new program2();
		p2.sub(x, y);
		program3 p3=new program3();
		p3.mul(x, y);
		program4 p4=new program4();
		p4.div(x, y);
		
		sc.close();
	}

}
