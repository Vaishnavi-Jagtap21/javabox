package Encapsulation;

import java.util.Scanner;

class account{
	private String name ;
     private int a_no,bal;
	account(String n,int a,int b)
	{
		this.name=n;
		this.a_no=a;
		this.bal=b;
	}
	public String getName() {
		return name;
	}
	public int getA_no() {
		return a_no;
	}
	public int getBal() {
		return bal;
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		String n=sc.next();
		System.out.println("Enter Account no : ");
		int a=sc.nextInt();
		System.out.println("Enter balance : ");
		int b=sc.nextInt();
		account a1=new account( n, a, b);
		System.out.println(" NAME IS : "+a1.getName());
		System.out.println("Account No :"+a1.getA_no());
		System.out.println("Balance is : "+a1.getBal());
		
	}

}
