package Interfaces;

interface Parent1{
	public void hi();
}
interface Parent2
{
	public void hello();
}
interface child extends Parent1,Parent2
{
	public void child();
}

public class Multiple implements child{
	public void hi()
	{
		System.out.println("Hii");
	}
	public void hello()
	{
		System.out.println("Hello");
	}
	public void child()
	{
		System.out.println("Child is printing");
	}
	public static void main(String[] args) {
		 Multiple m=new Multiple();
		 m.hi();
		 m.hello();
		 m.child();

	}

}
