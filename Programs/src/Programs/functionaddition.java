package Programs;
import java.util.*;
class myclass1
{
	private int a,b,c;
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number for Addition : ");
		a=sc.nextInt();
		System.out.println("Enter Second Number for Addition : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" And "+b+" Is : "+c);
		sc.close();
	}
}
public class functionaddition {

	public static void main(String[] args) {
		//Addition program using function
		myclass1 m=new myclass1();
		m.add();
		
	}
	
}
