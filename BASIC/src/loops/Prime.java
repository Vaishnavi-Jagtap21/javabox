package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number To Check The Number Is Prime Or Not");
        int num=sc.nextInt();
        int count=0;
        if(num==1){
        	System.out.println("1 is neither prime nor composite");
        }
        else if(num>1)
        {
        for(int i=2;i<num;i++)
        {
        	if(num%i==0)
        	{
        		count++;
        	}
        }
        if(count==0)
        {
        	System.out.println(num +" Prime Number");
        }
        else
        {
        	System.out.println(num +" Composite Number");
        }}
        else {
        	System.out.println();
        }sc.close();
	}
	

}
