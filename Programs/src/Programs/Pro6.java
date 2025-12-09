package Programs;
import java.util.*;
class rclass
{
	private int a,b,c;
	Scanner sc=new Scanner(System.in);
	public int add()
	{
		System.out.println("Enter Two Numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return(c);
	}
}
public class Pro6 {

	public static void main(String[] args) {
		// return value Program
		int z;
		rclass r=new rclass();
		z=r.add();
		System.out.println(z);

	}

}
