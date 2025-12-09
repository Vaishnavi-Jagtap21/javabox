package Programs;
import java.util.*;
class dclass
{
	private int i=1,n;
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		System.out.println("Enter Any Number : ");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i=i+1;
		}
		sc.close();
	}
}
public class Pro9 {

	public static void main(String[] args) {
		// display number
		dclass d=new dclass();
		d.display();

	}

}
