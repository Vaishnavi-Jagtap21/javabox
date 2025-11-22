package Array;

import java.util.Scanner;

public class TwoDiamension {

	public static void main(String[] args) {
		// 2D
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Classes : ");
		int m=sc.nextInt();
		System.out.println("Enter Number Of Students (All Clases): ");
		int std=sc.nextInt();
		int array[][]=new int[m][std];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
			   System.out.println("Enter The Age Of Class "+(i+1)+"'s"+(j+1)+"th Student");
			   array[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
			   System.out.println(" The Age Of Class "+(i+1)+"'s"+(j+1)+"th Student is "+array[i][j]);
			    
			}
		}
	}

}
