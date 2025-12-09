//package Inheritance;
//
//class father
//{
//
//	String name ="Poonam";
//	void Info()
//	{
//		System.out.println("Hello all ,I am " +name);
//	}
//}
//
//class Child1 extends father {
//	String name ="Prathmesh";
//	void Info()
//	{
//		System.out.println("Hello all ,I am " +name);
//	}
//}
//
//class Child2 extends father {
//	String name ="Rahul";
//	void Info()
//	{
//		System.out.println("Hello all ,I am " +name);
//	}
//}
//
//public class HirarchicalInheritance {
//
//	public static void main(String[] args) {
//		father f=new father();
//		f.Info();
//		
//		 Child1 c1 = new Child1();
//	     c1.Info();
//
//	        
//	     Child2 c2 = new Child2();
//	     c2.Info();
//		
//
//	}
//
//}






package Inheritance;

class mather
{

	String name ="Poonam";
	void Info()
	{
		System.out.println("Hello all ,I am " +name);
	}
}

class Child1 extends mather {
	String name ="Prathmesh";
	void Info()
	{
		System.out.println("Hello all ,I am " +name);
	}
}

class Child2 extends mather {
	String name ="Rahul";
	void Info()
	{
		System.out.println("Hello all ,I am " +name);
	}
}

public class HirarchicalInheritance {

	public static void main(String[] args) {
		mather f=new mather();
		f.Info();
		
		 Child1 c1 = new Child1();
	     c1.Info();

	        
	     Child2 c2 = new Child2();
	     c2.Info();
		

	}

}