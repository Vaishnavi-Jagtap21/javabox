package Objects;

public class Calculator {
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is : "+c);
		
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Substraction is : "+c);
		
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Division is : "+c);
	}
	void Multi(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication is : "+c);
		
	}
     void mod(int a,int b)
     {
    	 int c=a%b;
    	 System.out.println("Modulo is : "+c);
     }
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		c.add(20,30);
		c.sub(20,30);
		c.div(20,30);
		c.Multi(20,30);
        c.mod(10,20);
	}

}
