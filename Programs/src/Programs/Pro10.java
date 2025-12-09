package Programs;
import java.util.*;
class gclass
{
	private int i=1,n;
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		System.out.println("Enter 2 number : ");
		i=sc.nextInt();
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i=i+1;
		}
	}
}
public class Pro10 {

	public static void main(String[] args) {
		// Given number to given number display
		gclass g=new gclass();
		g.display();

	}

}
