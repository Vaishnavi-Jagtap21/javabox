package functions;

public class User {
	
	// No input No Output
//	public void multi()
//	{
//		int a=20;
//		int b=30;
//		System.out.println(a*b);
//	}
	//No input But Output
//	public int add()
//	{
//		int a=20;
//		int b=15;
//		return a+b;
//	}
	//Input But No Output
//	public void add1(int a,int b)
//	{
//		System.out.println(a+b);
//	}
	//Input and Output
	public int add2(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		
		User obj=new User();
//		obj.multi();
//		System.out.println(obj.add());
//		obj.add1(15,12);
		System.out.println(obj.add2(15,12));
		

	}

}

