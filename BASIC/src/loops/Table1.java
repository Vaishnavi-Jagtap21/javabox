package loops;
import java.util.Scanner;
public class Table1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int t=sc.nextInt();
		for(int i =1 ; i<=10; i++)
		{
			
			System.out.println(t + "*" +i+ "= "+t*i);
		}sc.close();

	}

}
