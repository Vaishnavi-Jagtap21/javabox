package game;

import java.util.Scanner;

public class Kbc {

	public static void main(String[] args) {
		// Kaun Banega CrorePati
		Scanner sc=new Scanner(System.in);
		System.out.println("---Welcome To KBC---");
		String a[][]=new String[5][6];
		a[0][0]="Who Is The Prime Minister Of India?";
		a[0][1]="[a.Yogi Adityanath b.Rahul Gandhi c.Virat Koholi d.Narendra Modi]";
		a[0][2]="d";
		a[1][0]="Who Is The President Of India?";
		a[1][1]="[a.Sharad Pawar b.Rahul Gandhi c.Droupati Murmu d.Narendra Modi]";
		a[1][2]="c";
		a[2][0]="Which is the national Animal of India?";
		a[2][1]="[a.Tiger b.Cat c.Peacock d.Lion]";
		a[2][2]="a";
		a[3][0]="Who is the God of the Cricket?";
		a[3][1]="[a.virat Koholi b.Sachin Tendulkar c.Ms Dhoni d.Jack Kalis]";
		a[3][2]="b";
		a[4][0]="Who is the King of  Cricket?";
		a[4][1]="[a.virat Koholi b.Sachin Tendulkar c.Ms Dhoni d.Jack Kalis]";
		a[4][2]="a";
		
		int price=1000;
		String ans;
		int q=0;
		boolean iscomplete=true;
         do {
     		System.out.println(a[q][0]+"\n"+a[q][1]+"\n The Answer is: ");
     		ans=sc.next();
     		if(ans.equals(a[q][2]))
     		{
     			price=price+price*q;
     			System.out.println("Congratulation You are Right!...You Won"+price+"rupees.\n");
     		}
     		else
     		{   
     			if(q==0)
     			{
     				System.out.println("Invalid Answer");
     			}else
     			{
     			System.out.println("Invalid Answer,you Won "+price+"rupees.\n");
     			}
     			iscomplete=false;
     			break;
     		}
     		q++;
         }while(q<a.length);
         
         if(iscomplete==true)
         {
        	 System.out.println("!!--Congratulation You Won KBC--!!");
         }

	}

}
