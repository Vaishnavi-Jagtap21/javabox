package Array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDiamension {

	public static void main(String[] args) {
		//1D
		Scanner sc=new Scanner(System.in);
		int [] array;
		System.out.println("Enter Number Of Element 1D Array");
		int n=sc.nextInt();
		array =new int[n];
		int a;
		for(int i=0;i<n;i++)
		{   
			System.out.println("Enter The Number For index "+i+":");
			a=sc.nextInt();
			array[i]=a;
		}
		for(int j=0;j<n;j++)
		{
			System.out.println("array["+j+"]="+array[j]);
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
