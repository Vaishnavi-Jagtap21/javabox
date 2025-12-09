//package Inheritance;
//
//class Demo1
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Demo1");
//	}
//}
//class Demo2 extends Demo1
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Demo2");
//	}
//}
//
//class Test1 extends Demo2
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Test1");
//	}
//}
//
//class Test2 extends Demo2
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Test2");
//	}
//}
//public class Hybrid {
//
//	public static void main(String[] args) {
//		Demo2 d2 = new Demo2();
//		d2.Hello();
//		Test1 t1 = new Test1();
//		t1.Hello();
//		Test2 t2 = new Test2(); 
//		t2.Hello();
//		
//
//	}
//
//}





//
//package Inheritance;
//
//class Poonam
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Poonam");
//	}
//}
//class Nisha extends Poonam
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Nisha");
//	}
//}
//
//class Test1 extends Nisha
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Test1");
//	}
//}
//
//class Test2 extends Nisha
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Test2");
//	}
//}
//public class Hybrid {
//
//	public static void main(String[] args) {
//		Nisha d2 = new Nisha();
//		d2.Hello();
//		Test1 t1 = new Test1();
//		t1.Hello();
//		Test2 t2 = new Test2(); 
//		t2.Hello();
//		
//
//	}
//
//}









//package Inheritance;
//
//class Cat
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Demo1");
//	}
//}
//class Vaishnvi extends Cat
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Demo2");
//	}
//}
//
//class Test1 extends Vaishnvi
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Test1");
//	}
//}
//
//class Test2 extends Vaishnvi
//{
//	void Hello()
//	{
//		System.out.println("Hello Student, from Test2");
//	}
//}
//public class Hybrid {
//
//	public static void main(String[] args) {
//		Vaishnvi d2 = new Vaishnvi();
//		d2.Hello();
//		Test1 t1 = new Test1();
//		t1.Hello();
//		Test2 t2 = new Test2(); 
//		t2.Hello();
//		
//
//	}
//
//}













package Inheritance;

class Cat
{
	void Hello()
	{
		System.out.println("Hello Student, from Demo1");
	}
}
class Vaishnvi extends Cat
{
	void Hello()
	{
		System.out.println("Hello Student, from Demo2");
	}
}

class Demo1 extends Vaishnvi
{
	void Hello()
	{
		System.out.println("Hello Student, from Test1");
	}
}

class Demo2 extends Vaishnvi
{
	void Hello()
	{
		System.out.println("Hello Student, from Test2");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		Vaishnvi d2 = new Vaishnvi();
		d2.Hello();
		Demo1 t1 = new Demo1();
		t1.Hello();
		Demo2 t2 = new Demo2(); 
		t2.Hello();
		

	}

}