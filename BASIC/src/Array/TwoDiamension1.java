package Array;

import java.util.Scanner;

public class TwoDiamension1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Classes : ");
		int m=sc.nextInt();
		System.out.println("Enter Number Of Students (All Clases): ");
		int std=sc.nextInt();
		int array[][]=new int[m][std];
		for( m=0;m<array.length;m++)
		{
			for( std=0;std<array[m].length;std++)
			{
			   System.out.println("Enter The Age Of Class "+(m+1)+"'s"+(std+1)+"th Student");
			   array[m][std]=sc.nextInt();
			}
		}
		System.out.println();
		for(m=0;m<array.length;m++)
		{
			for( std=0;std<array[m].length;std++)
			{
			   System.out.println(" The Age Of Class "+(m+1)+"'s"+(std+1)+"th Student is "+array[m][std]);
			    
			}
		}

	}

}
