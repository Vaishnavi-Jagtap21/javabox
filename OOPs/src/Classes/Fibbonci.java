package Classes;

import java.util.Scanner;

public class Fibbonci {

	public static void main(String[] args) {
//		Fibbonci series
		int n1=0,n2=1,n3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Fibbonci Element");
		int n=sc.nextInt();
		if(n>0)
		{
			if(n==1)
			{
				System.out.println(n1);
			}
			else
			{
				if(n==2)
				{
					System.out.println(n1+"\t"+n2);
				}
				else
				{
					System.out.println(n1+"\t"+n2);
					for(int i=3;i<=n;i++)
					{
						n3=n1+n2;
						n1=n2;
						n2=n3;
						System.out.println("\t"+n3);
					}
				}
			}
		}else
		{
				System.out.println("Invalid Input");
		}
		
	}

}
