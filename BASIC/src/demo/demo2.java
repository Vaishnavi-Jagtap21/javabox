package demo;

public class demo2 {

	public static void main(String[] args) {
		// Reverse number 
		//1234=4321
		int num=1234;
		int rev=0;
		while(num>0)
		{
			int temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);

	}

}
