package Constructor;

public class Animal {
	String name;
	String bried;
	Animal()
	{
		System.out.println("This Is Default Constructor");
	}
	Animal(String n,String b)
	{
		name=n;
		bried=b;
	}
	void test()
	{
		System.out.println("The Name is "+name+" And bried is "+bried);
	}

	public static void main(String[] args) {
		// Parameterized Constructor
		Animal d=new Animal("Tommy","Rodger");
		Animal a=new Animal();
		d.test();

	}

}
