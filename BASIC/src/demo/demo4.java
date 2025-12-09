package demo;

public class demo4 {

	public static void main(String[] args) {
		// Palindrome
				//1234=4321
				int num=12321;
				int num1=num;
				int rev=0;
				while(num>0)
				{
					int temp=num%10;
					rev=rev*10+temp;
					num=num/10;
				}
				
            if(num1==rev)
            {
             System.out.println("Given Number is Palindrome");
            }
            else
            {
            	System.out.println("Not Palindrome");
            }
	}

}
